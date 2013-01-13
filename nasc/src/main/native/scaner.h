#ifndef SCANER_H_
#define SCANER_H_

#include "NASC_y.h"

using namespace yy;

class code_driver {
    public:
        code_driver();
        virtual ~code_driver();

        int result;

        void scan_begin();
        void scan_end();
        bool trace_scanning;

        int parse (const std::string& f);
        std::string file;
        bool trace_parsing;

        void error (const yy::location& l, const std::string& m);
        void error (const std::string& m);
};

#define YY_DECL \
       parser::token_type \
       yylex (parser::semantic_type* yylval, parser::location_type* yylloc, code_driver& driver)
YY_DECL;


#endif /* SCANER_H_ */