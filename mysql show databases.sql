mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| angular            |
| anp_d4848          |
| eduportal          |
| employee_attrition |
| information_schema |
| mysql              |
| performance_schema |
| prognozdb          |
| sakila             |
| sampledb           |
| smsdb              |
| studentdb          |
| studentdb1         |
| sys                |
| world              |
+--------------------+
15 rows in set (0.14 sec)

mysql> use anp_d4848;
Database changed
mysql> show tables;
+---------------------+
| Tables_in_anp_d4848 |
+---------------------+
| product             |
| studentinfo         |
+---------------------+
2 rows in set (0.02 sec)

mysql> CREATE TABLE student (
    ->     id INT PRIMARY KEY,
    ->     name VARCHAR(10) NOT NULL,
    ->     address VARCHAR(10) NOT NULL,
    ->     age INT NOT NULL
    -> );
Query OK, 0 rows affected (0.10 sec)

mysql> CREATE TABLE student (
    ->     id INT PRIMARY KEY,
    ->     name VARCHAR(10) NOT NULL,
    ->     address VARCHAR(10) NOT NULL,
    ->     age INT NOT NULL
    -> );
ERROR 1050 (42S01): Table 'student' already exists
mysql> INSERT INTO student VALUES (1, 'Amit', 'Mumbai', 20);
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO student VALUES (2, 'Riya', 'Pune', 22);
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO student VALUES (3, 'Rahul', 'Delhi', 19);
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO student VALUES (4, 'Neha', 'Nashik', 21);
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO student VALUES (5, 'Kiran', 'Nagpur', 23);
Query OK, 1 row affected (0.02 sec)

mysql> SELECT * FROM student;
+----+-------+---------+-----+
| id | name  | address | age |
+----+-------+---------+-----+
|  1 | Amit  | Mumbai  |  20 |
|  2 | Riya  | Pune    |  22 |
|  3 | Rahul | Delhi   |  19 |
|  4 | Neha  | Nashik  |  21 |
|  5 | Kiran | Nagpur  |  23 |
+----+-------+---------+-----+
5 rows in set (0.00 sec)

mysql> SELECT SUM(age) AS total_age FROM student;
+-----------+
| total_age |
+-----------+
|       105 |
+-----------+
1 row in set (0.00 sec)

mysql> SELECT AVG(age) AS average_age FROM student;
+-------------+
| average_age |
+-------------+
|     21.0000 |
+-------------+
1 row in set (0.00 sec)

mysql> SELECT MIN(age) AS minimum_age FROM student;
+-------------+
| minimum_age |
+-------------+
|          19 |
+-------------+
1 row in set (0.00 sec)

mysql> SELECT MAX(age) AS maximum_age FROM student;
+-------------+
| maximum_age |
+-------------+
|          23 |
+-------------+
1 row in set (0.00 sec)

mysql> SELECT COUNT(age) AS total_students FROM student;
+----------------+
| total_students |
+----------------+
|              5 |
+----------------+
1 row in set (0.01 sec)