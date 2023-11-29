
# Vevika Health Questions
  Here are the task which is mentioned below 
   - Applying factory pattern when there are n number of services. 
   - Remove Duplicate elements from Array List without using Set. 
   - Create a sql query to see the paid result when the user pays the bill. 


## Tech Stack

**Language:** Core Java

**Framework:** Spring Boot

**API Testing Application:** Postman

## Run Locally

Clone the project

```bash
  git clone https://github.com/suminshakya/Viveka-health-questions
```

Go to the project directory

```bash
  cd VivekaHealthQuestion
```

Install dependencies

```bash
  gradlew clean build
```

```bash
  gradle bootRun
```

# Question No 1
## API Reference


### Get report services

```http
  GET /api/v1/report?reportType=recordType 
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `reportType`      | `string` | **Required**.  Report type value i.e(excel/pdf/word)|


#### Request

```http
  /api/v1/reportType?reportType=excel
```

#### Response
```
This is excel report

```
# Question No 2

Go to the RemoveDuplicateTest class located on test folder and run the test case to get expected result.

# Question No 3
Run the sql provided in the patch folder located in resources folder to get the expected result.




