grammar Demo;
code
	:	mathC=math_expression* EOF
	;

math_expression
	:																
		OPENPAREN math=math_expression CLOSEPAREN	
	|	left=math_expression op=('*'|'/'|'%') right=math_expression		
	|	left=math_expression op=('+'|'-') right=math_expression
	|	NUMBER						
    ;
 
NUMBER
	:	'$'? [0-9] + ('.' [0-9]+)? 
//	|	'$'?  ('.' [0-9]+)
	;
	
DEC
	: '.'
	;
	
OPENPAREN
	:	'('
	;
	
CLOSEPAREN
	:	')'
	;