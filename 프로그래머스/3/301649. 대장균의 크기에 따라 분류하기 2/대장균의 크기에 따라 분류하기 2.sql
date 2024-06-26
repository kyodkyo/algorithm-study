WITH 
RANKED_ECOLI AS (
    SELECT ID, NTILE(4) OVER (ORDER BY SIZE_OF_COLONY DESC) AS ECOLI_RANK
    FROM ECOLI_DATA
),
COLONYS AS (
    SELECT ID, CASE WHEN ECOLI_RANK = 1 THEN "CRITICAL"
                    WHEN ECOLI_RANK = 2 THEN "HIGH"
                    WHEN ECOLI_RANK = 3 THEN "MEDIUM"
                    WHEN ECOLI_RANK = 4 THEN "LOW"
                END AS COLONY_NAME
    FROM RANKED_ECOLI
)

SELECT E.ID, COLONY_NAME
FROM ECOLI_DATA E JOIN COLONYS C
ON E.ID = C.ID
ORDER BY E.ID