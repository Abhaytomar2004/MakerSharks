# MakerSharks

This is a proof of concept (POC) for a search API that allows buyers to search for manufacturers based on customized requirements such as location, nature of business, and manufacturing processes.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- MYSQL Database (for in-memory testing)
- Maven

## Getting Started

### Prerequisites

- Java 17+
- Maven 3.6+
- IDE of your choice (e.g., IntelliJ IDEA, Eclipse , STS)
- Postman (for testing API endpoints)

### Installation

1. Clone the repository:
   ```bash
  [ git clone https://github.com/your-username/makersharks-search-api.git](https://github.com/Abhaytomar2004/MakerSharks.git)
2 . Navigate to the project Directory 
cd makersharks-search-api(bash)
3. Build the project using maven 
mvn clean install (bash)
4 running the application 
mvn spring-boot:run (bash) 
###Curl commands
curl -X POST "http://localhost:8080/api/supplier/query" \
    -d "location=meerut" \
    -d "natureOfBusiness=raw \
    -d "manufacturingProcesses=small scale" \
    -d "page=0" \
    -d "size=10"

