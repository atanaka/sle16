% BEGIN ...
:- module(tblOne, []).
% END ...
world(Ps) :- map(tblOne:person, Ps).
person((_, [_])).
