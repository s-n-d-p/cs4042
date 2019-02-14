<?php
    $dbhost = "localhost";
    $dbuser="sandeep";
    $dbpass="root";
    $db="webp";
    $conn = new mysqli($dbhost, $dbuser, $dbpass, $db);
    $author = $_POST['author'];
    $title = $_POST['title'];
    $category = $_POST['category'];
    $year = $_POST['year'];
    $query = "INSERT INTO book (author, title, category, year) VALUES ('" . $author . "', '" . $title . "', '" .$category ."', '" . $year ."');";
    $inserted_tuple = mysqli_query($conn, $query);
    header("Location: ./index.html");
?>