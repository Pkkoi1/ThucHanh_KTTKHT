# Sử dụng hình ảnh Java chính thức
FROM openjdk:17-jdk-slim

# Thiết lập thư mục làm việc
WORKDIR /app

# Sao chép file JAR vào container
COPY target/*.jar app.jar

# Lệnh chạy khi container khởi động
ENTRYPOINT ["java", "-jar", "app.jar"]
