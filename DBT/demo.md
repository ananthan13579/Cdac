#### Correlate sub-query (Using the Exist operator)
This is exception when sub-query is faster than join
If you have join along with DISTINCT, to make it work faster use Correlated sub-query (use the EXISTS operator)
Display the DNAMEs that contain employees & the DNAMEs that do contain employees

<table>
<tr>
<td>

##### Solution #1: 
select deptno from emp;

1
1
1
2
2
select distinct deptno from emp;

1
2
select dname from dept
where deptno =any
(select disting deptno from emp);

OUTPUT
TRN
EXP
