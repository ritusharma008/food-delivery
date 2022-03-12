<?php
$str1 = 'National';
$str2 = 'Nationel';
$find = strspn($str1 ^ $str2, "\0");
printf('First difference at position %d: "%s" vs "%s"', $find, $str1[$find], $str2[$find]);
?>