grammar AgentQuery;

query
    : WS* criteria WS* (WS OrderBy WS+ order (WS+ And WS+ order)* WS*)? EOF
    | WS* OrderBy WS+ order (WS+ And WS+ order)* WS* EOF
    | WS* EOF
    ;

criteria
	: operator=(Online|Offline|Paused|HasRunningBuilds) #OperatorCriteria
	| operator=(HasAttribute|NotUsedSince|EverUsedSince|RanBuild) WS+ criteriaValue=Quoted #OperatorValueCriteria
    | criteriaField=Quoted WS+ operator=(Is|IsGreaterThan|IsLessThan) WS+ criteriaValue=Quoted #FieldOperatorValueCriteria
    | criteria WS+ And WS+ criteria	#AndCriteria
    | criteria WS+ Or WS+ criteria #OrCriteria
    | Not WS* LParens WS* criteria WS* RParens #NotCriteria
    | LParens WS* criteria WS* RParens #ParensCriteria
    ;

order
	: orderField=Quoted WS* (WS+ direction=(Asc|Desc))?
	;

Online
	: 'online'
	;

Offline
	: 'offline'
	;

Paused
	: 'paused'
	;

HasRunningBuilds
    : 'has' WS+ 'running' WS+ 'builds'
    ;

HasRunningJobsOfProject
    : 'has' WS+ 'running' WS+ 'jobs' WS+ 'of' WS+ 'project'
    ;
    
HasRunningJobsOfBranch
    : 'has' WS+ 'running' WS+ 'jobs' WS+ 'of' WS+ 'branch'
    ;
    
HasAttribute
    : 'has' WS+ 'attribute'
    ;
    
NotUsedSince
    : 'not' WS+ 'used' WS+ 'since'
    ;
    
EverUsedSince
    : 'ever' WS+ 'used' WS+ 'since'
    ;

SelectedByExecutor
	: 'selected' WS+ 'by' WS+ 'executor'
	;
	
RanBuild
	: 'ran' WS+ 'build'
	;

OrderBy
    : 'order by'
    ;

Is
	: 'is'
	;

IsGreaterThan
	: 'is' WS+ 'greater' WS+ 'than'
	;
	
IsLessThan
	: 'is' WS+ 'less' WS+ 'than'
	;
	
And
	: 'and'
	;

Or
	: 'or'
	;

Not
	: 'not'
	;

Asc
	: 'asc'
	;

Desc
	: 'desc'
	;

LParens
	: '('
	;

RParens
	: ')'
	;

Quoted
    : '"' ('\\'.|~[\\"])+? '"'
    ;

WS
    : ' '
    ;

Identifier
	: [a-zA-Z0-9:_/\\+\-;]+
	;
