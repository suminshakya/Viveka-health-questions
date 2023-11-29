SELECT c1.customer_id,
       c1.start_date  AS change_event_date,
       'FREE -> PAID' AS event_change
FROM   tbl_customer c1
           JOIN tbl_customer c2
                ON c1.customer_id = c2.customer_id
                    AND c1.event = 'PAID'
                    AND c2.event = 'FREE'
                    AND c1.start_date > c2.start_date;