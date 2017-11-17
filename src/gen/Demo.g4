grammar Demo;

math_expression
	:	'$'? NUMBER
	|   NUMBER '(' NUMBER ')'
	|	'(' left=math_expression op=('*'|'/'|'%') right=math_expression ')' 
    |   '(' left=math_expression op=('+'|'-') right=math_expression ')'
	|	left=math_expression op=('*'|'/'|'%') right=math_expression
	|	left=math_expression op=('+'|'-') right=math_expression
    ;
 
NUMBER
	:	 '$'? [0-9]+ ('.' [0-9]+)? 
	;