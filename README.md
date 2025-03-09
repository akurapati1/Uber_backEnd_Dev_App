# yourRide Application Using SpringBoot

## Overview

This project is a back-end application for a ride-hailing service, inspired by Uber's functionalities. Developed using Spring Boot, it provides essential features such as user authentication, ride booking, driver management, and payment processing.

## Features

- **User Authentication**: Secure registration and login for riders and drivers.
- **Ride Booking**: Riders can request rides, view available drivers, and track ride status.
- **Driver Management**: Drivers can manage their availability, accept ride requests, and view ride history.
- **Payment Processing**: Integration with payment gateways for seamless transactions.
- **Ride History**: Both riders and drivers can access their past rides and related details.
- **Real-Time Notifications**: Updates on ride status, driver arrivals, and more.

## API Endpoints

### User Endpoints

- `POST /api/v1/users/register`: Register a new user.
- `POST /api/v1/users/login`: Authenticate a user and retrieve a token.
- `GET /api/v1/users/profile`: Retrieve user profile details.

### Ride Endpoints

- `POST /api/v1/rides/request`: Request a new ride.
- `GET /api/v1/rides/{id}`: Get details of a specific ride.
- `GET /api/v1/rides/history`: Retrieve ride history for a user.

### Driver Endpoints

- `POST /api/v1/drivers/register`: Register a new driver.
- `POST /api/v1/drivers/login`: Authenticate a driver and retrieve a token.
- `GET /api/v1/drivers/profile`: Retrieve driver profile details.
- `POST /api/v1/drivers/availability`: Update driver availability status.

### Payment Endpoints

- `POST /api/v1/payments/charge`: Process a payment for a ride.
- `GET /api/v1/payments/history`: Retrieve payment history for a user.

## Usage Instructions

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/akurapati1/Uber_backEnd_Dev_App.git
   cd Uber_backEnd_Dev_App
   ```

2. **Build the Application**:
   Ensure you have Maven installed. Run:
   ```bash
   mvn clean install
   ```

3. **Configure the Database**:
   Update the `application.properties` file with your database credentials:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/your_database
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   ```

4. **Run the Application**:
   ```bash
   mvn spring-boot:run
   ```
   The application will start on `http://localhost:8080`.

5. **Access API Documentation**:
   Navigate to `http://localhost:8080/swagger-ui.html` to explore the API endpoints and test them.

## Technologies Used

- **Java**: Primary programming language.
- **Spring Boot**: Framework for building the application.
- **MySQL**: Relational database management.
- **Hibernate**: ORM tool for database interactions.
- **Swagger**: API documentation and testing.

## Contribution Guidelines

1. Fork the repository.
2. Create a new branch:
   ```bash
   git checkout -b feature/your_feature_name
   ```
3. Commit your changes:
   ```bash
   git commit -m 'Add some feature'
   ```
4. Push to the branch:
   ```bash
   git push origin feature/your_feature_name
   ```
5. Open a pull request.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Contact

For questions or collaboration, reach out to [your_email@example.com](abhilash.kurapati@slu.edu).

