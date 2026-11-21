-- CREATE: テーブル作成
CREATE TABLE students (
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    age INT DEFAULT NULL,
    PRIMARY KEY (id)
);

-- INSERT: データ入力
INSERT INTO students (name, age) VALUES ('田中', 25), ('佐藤', 30), ('鈴木', 22);

-- SELECT: データ確認
SELECT * FROM students;

-- UPDATE: データ更新
UPDATE students SET age = 26 WHERE id = 1;

-- SELECT: 更新結果の確認
SELECT * FROM students;

-- DELETE: データ削除
DELETE FROM students WHERE id = 3;

-- INSERT: 最終的に3件に戻す
INSERT INTO students (name, age) VALUES ('山田', 28);

-- SELECT: 最終確認
SELECT * FROM students;