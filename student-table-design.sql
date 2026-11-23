-- 受講生テーブル
CREATE TABLE students (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    furigana VARCHAR(100) NOT NULL,
    nickname VARCHAR(50),
    email VARCHAR(255) NOT NULL,
    city VARCHAR(100),
    age TINYINT UNSIGNED NOT NULL,
    gender VARCHAR(30)
);

-- 受講生コーステーブル
CREATE TABLE students_courses (
    id INT AUTO_INCREMENT PRIMARY KEY,
    student_id INT NOT NULL,
    course_name VARCHAR(100) NOT NULL,
    start_date DATE NOT NULL,
    expected_end_date DATE NOT NULL,
    FOREIGN KEY (student_id) REFERENCES students(id),
    CHECK (expected_end_date >= start_date)
);