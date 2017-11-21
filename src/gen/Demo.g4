grammar Demo;
math_expression
	:	NUMBER
	
	|	left=math_expression op=('*'|'/'|'%') right=math_expression
	|	left=math_expression op=('+'|'-') right=math_expression
	|	'(' math=math_expression')'
    ;
 
NUMBER
	:	 '$'? [0-9]+ ('.' [0-9]+)? 
	;