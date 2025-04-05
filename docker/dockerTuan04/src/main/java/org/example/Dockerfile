FROM openjdk:17-jdk-slim

# Tạo thư mục làm việc trong container
WORKDIR /app

# Copy file Main.java từ thư mục hiện tại trên máy → vào thư mục /app trong container
COPY Main.java Main.java

# Biên dịch file Java
RUN javac Main.java

# Chạy chương trình
CMD ["java", "Main"]
