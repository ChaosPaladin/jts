#include "scaner.h"

code_driver::code_driver() : trace_scanning (false), trace_parsing (false) {
}

code_driver::~code_driver() {
}

int code_driver::parse(const std::string &f) {
    file = f;
    scan_begin();
    parser p(*this);

    #if YYDEBUG
    p.set_debug_level(trace_parsing);
    #endif

    int res = p.parse();
    scan_end();
    return res;
}

void code_driver::error(const yy::location& l, const std::string& m) {
    std::cerr << l << ": " << m << std::endl;
}

void code_driver::error(const std::string& m) {
    std::cerr << m << std::endl;
}