%skeleton "lalr1.cc"
%require "2.4.1"
%defines

%code requires {
#include <stdio.h>
#include <string>

class code_driver;

using namespace std;
}

%parse-param { code_driver& driver }
%lex-param   { code_driver& driver }

%code {
#include "compiler.h"
#include "pch_util.h"
#include "scaner.h"
}

%debug
%error-verbose

%union {
	struct {
		int int_val;
		float float_val;
		std::string* str_val;
	};
}

%locations
%initial-action
{
    // Initialize the initial location.
    @$.begin.filename = @$.end.filename = &driver.file;
};

// language words
%token CLASS
%token NULL_PARENT
%token PARAMETER
%token PROPERTY
%token HANDLER
%token EVENT_HANDLER
%token INT
%token FLOAT
%token STRING
%token WAY_POINTS_TYPE // unknown type
%token WAY_POINTS_DELAY_TYPE // unknown type
%token BUY_SELL_LIST TEL_POS_LIST
%token IF ELSE
%token SWITCH CASE
%token BREAK RETURN SUPER
%token WHILE FOR

// language operators
%token FUNCTION_CALL_OPERATOR
%token OR_OPERATOR
%token AND_OPERATOR
%token EQUAL_OPERATOR
%token NOT_EQUAL_OPERATOR
%token LE_OPERATOR
%token GE_OPERATOR

// values
%token<int_val> INT_VALUE
%token<float_val> FLOAT_VALUE
%token<str_val> STRING_VALUE
%token<str_val> ID
%token<str_val> LINKED_VALUE
%token END 0

%type<str_val> class_name_declaration
%type<str_val> class_parent
%type<str_val> class_body

%type<str_val> parameter_section
%type<str_val> parameters
%type<str_val> parameter


%type<str_val> property_section
%type<str_val> properties
%type<str_val> property
%type<str_val> property_params
%type<str_val> p_params


%type<str_val> handler_section
%type<str_val> handlers
%type<str_val> handler
%type<str_val> handler_param_declaration
%type<str_val> handler_params
%type<str_val> handler_param
%type<str_val> handler_body
%type<str_val> handler_body_units
%type<str_val> handler_body_unit

%type<str_val> expression
%type<str_val> function_params

%type<str_val> statement
%type<str_val> selection_statement
%type<str_val> cases_statement
%type<str_val> case_statement
%type<str_val> iteration_statement

%type<str_val> constant_expression
%type<str_val> assignment_expression
%type<str_val> conditional_expression
%type<str_val> logical_or_expression
%type<str_val> logical_and_expression
%type<str_val> inclusive_or_expression
%type<str_val> and_expression
%type<str_val> equality_expression
%type<str_val> relational_expression
%type<str_val> additive_expression
%type<str_val> multiplicative_expression

%type<str_val> unary_expression
%type<str_val> postfix_expression
%type<str_val> primary_expression
%type<str_val> function_call
%type<str_val> handler_param_value
%type<str_val> unary_operator

%type<str_val> handler_param_value_set

%destructor { delete $$; }  <str_val>
%destructor { delete $<str_val>$; }  INT_VALUE
%destructor { delete $<str_val>$; }  FLOAT_VALUE

%%

%start classes;

classes: class | classes class;

class: class_name_declaration ':' class_parent '{' class_body '}'  {
    std::string source("package ru.jts.nasc_loader.ai;\n\n");

    std::string imports("import ru.jts.gameserver.model.objects.Creature;\n");
    imports += "import ru.jts.gameserver.model.objects.Player;\n";


    // imports
    source += imports + "\n";

    // fileName
    std::string fName(*$<str_val>1);

    // class name
    source += "public class " + *$<str_val>1;

    // class parent
    source += " extends ";
    if($<int_val>3 == 0) { // has parent
        source += *$<str_val>3;
    } else if ($<int_val>3 == 1) { // has (null) parent
        if($<int_val>1 == 0) { // npc type
            source += "abstract_npc";
        } else if($<int_val>1 == 1) { // maker type
            source += "abstract_maker";
        }
    }

    // class body
    source += " {\n" + *$<str_val>5 + "\n}";

    // send source to Java code
	addSource(&fName, &source);
};

class_name_declaration: CLASS INT_VALUE ID {
	$<str_val>$ = new string(*$<str_val>3);
	$<int_val>$ = $<int_val>2;
};

class_parent: ID {
	$<str_val>$ = new string(*$<str_val>1);
	$<int_val>$ = 0;
}
| NULL_PARENT {
	$<int_val>$ = 1;
};

class_body: /* empty class body */ { $<str_val>$ = new std::string();}
| parameter_section {
    $<str_val>$ = new std::string(*$<str_val>1);
}
| parameter_section handler_section {
    //$<str_val>$ = new std::string(*$<str_val>1);
    $<str_val>$ = new std::string(*$<str_val>1 + "\n" + *$<str_val>2);
}
| parameter_section property_section {
    //$<str_val>$ = new std::string(*$<str_val>1);
    $<str_val>$ = new std::string(*$<str_val>1 + "\n" + *$<str_val>2);
}
| parameter_section property_section handler_section {
    //$<str_val>$ = new std::string(*$<str_val>1);
    $<str_val>$ = new std::string(*$<str_val>1 + "\n" + *$<str_val>2 + "\n" + *$<str_val>3);
}
| property_section  {
    //$<str_val>$ = new std::string();
    $<str_val>$ = new std::string(*$<str_val>1);
}
| property_section handler_section {
    //$<str_val>$ = new std::string();
    $<str_val>$ = new std::string(*$<str_val>1 + "\n" + *$<str_val>2);
}
| handler_section {
    //$<str_val>$ = new std::string();
    $<str_val>$ = new std::string(*$<str_val>1);
};

/* parameter section */
parameter_section: PARAMETER parameters {
    $<str_val>$ = new string(*$<str_val>2);
};

parameters: parameter ';' {
    $<str_val>$ = new string(*$<str_val>1 + ";\n");
}
| parameters parameter ';' {
    $<str_val>$ = new string(*$<str_val>1 + *$<str_val>2 + ";\n");
};

parameter: INT ID '=' unary_expression {
    $<str_val>$ = new string("\tprotected int " + *$<str_val>2 + " = " + *$<str_val>4);
}
| FLOAT ID '=' unary_expression {
    $<str_val>$ = new string("\tprotected double " + *$<str_val>2 + " = " + *$<str_val>4);
}
| STRING ID '=' STRING_VALUE {
    $<str_val>$ = new string("\tprotected String " + *$<str_val>2 + " = " + *$<str_val>4);
}
| WAY_POINTS_TYPE ID '=' /* empty value */ { // TODO
    $<str_val>$ = new string("\tprotected String " + *$<str_val>2 + " = \"\" ");
}
| WAY_POINTS_DELAY_TYPE ID '=' /* empty value */ {  // TODO
    $<str_val>$ = new string("\tprotected String " + *$<str_val>2 + " = \"\" ");
};

/* property section */
property_section: PROPERTY properties {
    $<str_val>$ = new string(*$<str_val>2);
};

properties: property ';' {
    $<str_val>$ = new string(*$<str_val>1 + ";\n");
}
| properties property ';' {
    $<str_val>$ = new string(*$<str_val>1 + *$<str_val>2 + ";\n");
};

property: BUY_SELL_LIST ID '=' '{' property_params'}' {
    $<str_val>$ = new string("protected Object[][] " + *$<str_val>2 + " = {\n" + *$<str_val>5 + "\n}");
}
| TEL_POS_LIST ID '=' '{' property_params '}' {
    $<str_val>$ = new string("protected Object[][] " + *$<str_val>2 + " = {\n" + *$<str_val>5 + "\n}");
};

property_params: /* empty params */ {
    $<str_val>$ = new string("");
}
|'{' p_params '}' {
    $<str_val>$ = new string("{" + *$<str_val>2 + "}");
}
| property_params ';' '{' p_params '}' {
    $<str_val>$ = new string(*$<str_val>1 + ", {" + *$<str_val>4 + "}");
};

p_params: unary_expression {
    $<str_val>$ = new string(*$<str_val>1);
}
| p_params ';' unary_expression {
    $<str_val>$ = new string(*$<str_val>1 + ";" + *$<str_val>3);
};

/* handler section */
handler_section: HANDLER handlers {
    $<str_val>$ = new string(*$<str_val>2);
};

handlers: handler {
    $<str_val>$ = new string(*$<str_val>1 + "\n\n");
}
| handlers handler {
    $<str_val>$ = new string(*$<str_val>1 + *$<str_val>2 + "\n\n");
};

handler: EVENT_HANDLER ID handler_param_declaration '{' handler_body '}' {
    $<str_val>$ = new string("\tprotected void " + *$<str_val>2 + *$<str_val>3 + " {\n" + *$<str_val>5 + "\t}");
};

handler_param_declaration: '(' /* empty param list */ ')' {
    $<str_val>$ = new string("()");
}
| '(' handler_params ')' {
    $<str_val>$ = new string("(" + *$<str_val>2 + ")");
};

handler_params: declared_handler_param {
    $<str_val>$ = new string(*$<str_val>1);
}
| handler_params ',' declared_handler_param {
    $<str_val>$ = new string(*$<str_val>1 + ", " + *$<str_val>3);
};

declared_handler_param: ID {
    $<str_val>$ = new string("HandlerParam " + *$<str_val>1);
};

handler_param: ID {
    $<str_val>$ = new string(*$<str_val>1);
};

handler_body: /* empty body */ {
    $<str_val>$ = new string("");
}
| handler_body_units {
    $<str_val>$ = new string(*$<str_val>1);
};

handler_body_units: handler_body_unit {
    $<str_val>$ = new string(*$<str_val>1);
}
| handler_body_units handler_body_unit {
    $<str_val>$ = new string(*$<str_val>1 + *$<str_val>2);
};

handler_body_unit: expression ';' {
    $<str_val>$ = new string(*$<str_val>1 + ";\n");
}
| statement {
    $<str_val>$ = new string(*$<str_val>1 + "\n");
};

/* expression section */
expression: handler_param_value_set {
    $<str_val>$ = new string(*$<str_val>1);
}
| function_call {
    $<str_val>$ = new string(*$<str_val>1);
}
| SUPER {
    $<str_val>$ = new string("super");
}
| RETURN {
    $<str_val>$ = new string("return");
}
| BREAK {
    $<str_val>$ = new string("break");
};

function_call: handler_param_value FUNCTION_CALL_OPERATOR ID '(' function_params ')' {
    $<str_val>$ = new string(*$<str_val>1 + "." + *$<str_val>3 + "(" + *$<str_val>5 + ")");
};

function_params: /* empty params */ {
    $<str_val>$ = new string();
}
| assignment_expression {
    $<str_val>$ = new string(*$<str_val>1);
}
| function_params ',' assignment_expression {
    $<str_val>$ = new string(*$<str_val>1 + ", " + *$<str_val>3);
};

/* statement section */
statement: selection_statement {
    $<str_val>$ = new string(*$<str_val>1);
}
| iteration_statement {
    $<str_val>$ = new string(*$<str_val>1);
};

// if..else, switch..case
selection_statement: IF '(' assignment_expression ')' '{' handler_body '}' {
    $<str_val>$ = new string("if (" + *$<str_val>3 + ") {\n" + *$<str_val>6 + "\n}");
}
| IF '(' assignment_expression ')' '{' handler_body '}' ELSE '{' handler_body '}' {
    $<str_val>$ = new string("if (" + *$<str_val>3 + ") {\n" + *$<str_val>6 + "\n} else {\n" + *$<str_val>10 + "\n}");
}
| IF '(' assignment_expression ')' '{' handler_body '}' ELSE selection_statement {
    $<str_val>$ = new string("if (" + *$<str_val>3 + ") {\n" + *$<str_val>6 + "\n} else " + *$<str_val>9);
}
| SWITCH '(' assignment_expression ')' '{' cases_statement '}' {
    $<str_val>$ = new string("switch (" + *$<str_val>3 + ") {\n" + *$<str_val>6 + "\n}");
};

cases_statement: case_statement {
    $<str_val>$ = new string(*$<str_val>1 + "\n");
}
| cases_statement case_statement {
    $<str_val>$ = new string(*$<str_val>1 + *$<str_val>2 + "\n");
};

case_statement: CASE constant_expression ':' '{' handler_body '}' {
    $<str_val>$ = new string("case " + *$<str_val>2 + ": {\n" + *$<str_val>5 + "\n}");
};

// for, while
iteration_statement: WHILE '(' conditional_expression ')' '{' handler_body '}' {
    $<str_val>$ = new string("while (" + *$<str_val>3 + ") {\n" + *$<str_val>6 + "\n}");
}
| FOR '(' expression ';' assignment_expression ';' assignment_expression ')' '{' handler_body '}' {
    $<str_val>$ = new string("for (" + *$<str_val>3 + "; " + *$<str_val>5 + "; " + *$<str_val>7 + ") {\n" + *$<str_val>10 + "\n}");
};

constant_expression: assignment_expression {
    $<str_val>$ = new string(*$<str_val>1);
};

assignment_expression: conditional_expression {
    $<str_val>$ = new string(*$<str_val>1);
}
| unary_expression '=' assignment_expression {
    $<str_val>$ = new string(*$<str_val>1 + " = " + *$<str_val>3);
};

conditional_expression: logical_or_expression {
    $<str_val>$ = new string(*$<str_val>1);
};

// A || B
logical_or_expression: logical_and_expression {
    $<str_val>$ = new string(*$<str_val>1);
}
| logical_or_expression OR_OPERATOR logical_and_expression {
    $<str_val>$ = new string(*$<str_val>1 + " || " + *$<str_val>3);
};

// A && B
logical_and_expression: inclusive_or_expression {
    $<str_val>$ = new string(*$<str_val>1);
}
| logical_and_expression AND_OPERATOR inclusive_or_expression {
    $<str_val>$ = new string(*$<str_val>1 + " && " + *$<str_val>3);
};

// A | B
inclusive_or_expression: and_expression {
    $<str_val>$ = new string(*$<str_val>1);
}
| inclusive_or_expression '|' and_expression {
    $<str_val>$ = new string(*$<str_val>1 + " | " + *$<str_val>3);
};

// A & B
and_expression: equality_expression {
    $<str_val>$ = new string(*$<str_val>1);
}
| and_expression '&' equality_expression {
    $<str_val>$ = new string(*$<str_val>1 + " & " + *$<str_val>3);
};

// A == B
// A != B
equality_expression: relational_expression {
    $<str_val>$ = new string(*$<str_val>1);
}
| equality_expression EQUAL_OPERATOR relational_expression {
    $<str_val>$ = new string(*$<str_val>1 + " == " + *$<str_val>3);
}
| equality_expression NOT_EQUAL_OPERATOR relational_expression {
    $<str_val>$ = new string(*$<str_val>1 + " != " + *$<str_val>3);
};

// A > B
// A < B
// A >= B
// A <= B
relational_expression: additive_expression {
    $<str_val>$ = new string(*$<str_val>1);
}
| relational_expression '<' additive_expression {
    $<str_val>$ = new string(*$<str_val>1 + " < " + *$<str_val>3);
}
| relational_expression '>' additive_expression {
    $<str_val>$ = new string(*$<str_val>1 + " > " + *$<str_val>3);
}
| relational_expression LE_OPERATOR additive_expression {
    $<str_val>$ = new string(*$<str_val>1 + " >= " + *$<str_val>3);
}
| relational_expression GE_OPERATOR additive_expression {
    $<str_val>$ = new string(*$<str_val>1 + " <= " + *$<str_val>3);
};

// A + B
// A - B
additive_expression: multiplicative_expression {
    $<str_val>$ = new string(*$<str_val>1);
}
| additive_expression '+' multiplicative_expression {
    $<str_val>$ = new string(*$<str_val>1 + " + " + *$<str_val>3);
}
| additive_expression '-' multiplicative_expression {
    $<str_val>$ = new string(*$<str_val>1 + " - " + *$<str_val>3);
};

// A * B
// A / B
// A % B
multiplicative_expression: unary_expression {
    $<str_val>$ = new string(*$<str_val>1);
}
| multiplicative_expression '*' unary_expression {
    $<str_val>$ = new string(*$<str_val>1 + " * " + *$<str_val>3);
}
| multiplicative_expression '/' unary_expression {
    $<str_val>$ = new string(*$<str_val>1 + " / " + *$<str_val>3);
}
| multiplicative_expression '%' unary_expression {
    $<str_val>$ = new string(*$<str_val>1 + " % " + *$<str_val>3);
};

unary_expression: postfix_expression {
    $<str_val>$ = new string(*$<str_val>1);
}
| unary_operator postfix_expression {
    $<str_val>$ = new string(*$<str_val>1 + *$<str_val>2);
};

unary_operator: '-' {
    $<str_val>$ = new string("-");
}
| '~' {
    $<str_val>$ = new string("~");
};

// function call, parameter call
postfix_expression: primary_expression {
    $<str_val>$ = new string(*$<str_val>1);
}
| function_call {
    $<str_val>$ = new string(*$<str_val>1);
};

// Primitive type
primary_expression: LINKED_VALUE {
    string* value = get_value_for(*$<str_val>1);
    $<str_val>$ = value;
}
| STRING_VALUE {
    $<str_val>$ = new string(*$<str_val>1);
}
| FLOAT_VALUE {
    $<str_val>$ = new string(*$<str_val>1);
}
| INT_VALUE {
    $<str_val>$ = new string(*$<str_val>1);
}
| handler_param_value {
    $<str_val>$ = new string(*$<str_val>1);
}
| '(' conditional_expression ')' {
    $<str_val>$ = new string(*$<str_val>2);
};

/* other section */

handler_param_value: handler_param {
    $<str_val>$ = new string(*$<str_val>1);
}
| handler_param_value '.' handler_param {
    $<str_val>$ = new string(*$<str_val>1 + "." + *$<str_val>3);
};

// myself.i_a0 = 0;
handler_param_value_set: handler_param_value {
    $<str_val>$ = new string(*$<str_val>1);
}
| handler_param_value '=' assignment_expression {
    $<str_val>$ = new string(*$<str_val>1 + " = " + *$<str_val>3);
}
| handler_param_value EQUAL_OPERATOR assignment_expression {  // Тоже самое, что и равно
    $<str_val>$ = new string(*$<str_val>1 + " = " + *$<str_val>3);
};

%%

void yy::parser::error(const yy::parser::location_type& l, const std::string& m) {
    driver.error (l, m);
}
