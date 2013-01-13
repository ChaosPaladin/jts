%{
#include <cstdlib>
#include <cerrno>
#include <climits>
#include <string>

#include "NASC_y.h"
#include "scaner.h"

#undef yywrap
#define yywrap() 1

#define YY_USER_ACTION yylloc->columns(yyleng);

#define yyterminate() return token::END

typedef yy::parser::token token;

%}


%option noyywrap nounput batch debug

%%

%{
	yylloc->step();
%}

"class"					{ return token::CLASS; }
"(null)"				{ return token::NULL_PARENT; }
"parameter:"			{ return token::PARAMETER; }
"property:"				{ return token::PROPERTY; }
"handler:"				{ return token::HANDLER; }
"EventHandler"			{ return token::EVENT_HANDLER; }
"int"					{ return token::INT; }
"float"					{ return token::FLOAT; }
"string"				{ return token::STRING; }
"waypointstype"			{ return token::WAY_POINTS_TYPE; }
"waypointdelaystype"	{ return token::WAY_POINTS_DELAY_TYPE; }
"BuySellList"			{ return token::BUY_SELL_LIST; }
"TelPosList"			{ return token::TEL_POS_LIST; }
"if"					{ return token::IF; }
"else"					{ return token::ELSE; }
"switch"				{ return token::SWITCH; }
"case"					{ return token::CASE; }
"break"					{ return token::BREAK; }
"return"				{ return token::RETURN; }
"super"					{ return token::SUPER; }
"while"					{ return token::WHILE; }
"for"					{ return token::FOR; }


"::"					{ return token::FUNCTION_CALL_OPERATOR; }
"||"					{ return token::OR_OPERATOR; }
"&&"					{ return token::AND_OPERATOR; }
"=="					{ return token::EQUAL_OPERATOR; }
"!="					{ return token::NOT_EQUAL_OPERATOR; }
">="					{ return token::LE_OPERATOR; }
"<="					{ return token::GE_OPERATOR; }

[0-9]+	{ 
		yylval->int_val = atoi(yytext);
		yylval->str_val = new std::string(yytext);
		return token::INT_VALUE;
}

[0-9]+.[0-9]+	{
		yylval->float_val = atof(yytext);
		yylval->str_val = new std::string(yytext);
		return token::FLOAT_VALUE;
}

\"(\\.|[^\\"])*\" {
		yylval->str_val = new std::string(yytext);
		return token::STRING_VALUE;
}

[A-Za-z_][A-Za-z0-9_]*	{
		yylval->str_val = new std::string(yytext);
		return token::ID; 
}

@[A-Za-z_][A-Za-z_0-9'\.]*	{
		yylval->str_val = new std::string(yytext);
		return token::LINKED_VALUE; 
}

[ \t\r]+ 	    { yylloc->step(); }
[\n]+           { yylloc->lines(yyleng); yylloc->step(); }
.               { return yy::parser::token_type (yytext[0]); }

%%

void code_driver::scan_begin () {
    yy_flex_debug = trace_scanning;
    if (file.empty () || file == "-")
        yyin = stdin;
    else if (!(yyin = fopen (file.c_str (), "r"))) {
        error ("cannot open " + file + ": " + strerror(errno));
        exit (EXIT_FAILURE);
    }
}

void code_driver::scan_end () {
    fclose (yyin);
}