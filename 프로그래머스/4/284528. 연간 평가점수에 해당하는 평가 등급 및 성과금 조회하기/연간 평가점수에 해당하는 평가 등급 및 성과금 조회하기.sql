SELECT E.EMP_NO, EMP_NAME,
    (CASE WHEN AVG(SCORE) >= 96 THEN 'S'
         WHEN AVG(SCORE) >= 90 THEN 'A'
         WHEN AVG(SCORE) >= 80 THEN 'B'
         ELSE 'C' END) AS GRADE,
     (CASE WHEN AVG(SCORE) >= 96 THEN SAL * 0.20
            WHEN AVG(SCORE) >= 90 THEN SAL * 0.15
            WHEN AVG(SCORE) >= 80 THEN SAL * 0.10
            ELSE 0 END) AS BONUS
FROM HR_GRADE G JOIN HR_EMPLOYEES E
ON G.EMP_NO = E.EMP_NO
GROUP BY G.EMP_NO
ORDER BY G.EMP_NO