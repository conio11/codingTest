SELECT ANIMAL_ID, NAME, 
        (CASE
           WHEN SEX_UPON_INTAKE LIKE '%Neutered%' OR SEX_UPON_INTAKE LIKE '%Spayed%' THEN 'O'
           ELSE 'X'
        END) AS 중성화
        -- CASE
        --    WHEN 조건1 THEN 값1
        --    WHEN 조건2 THEN 값2
        -- ...
        -- ELSE 기본값
        -- END
FROM ANIMAL_INS
ORDER BY ANIMAL_ID;