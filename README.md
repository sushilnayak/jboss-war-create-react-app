- npx create-react-app war-react-app --use-npm

- Update package.json with homepage for relative path understanding
    ```json
      "name": "war-react-app",
      "version": "0.1.0",
      "private": true,
      "homepage": "http://localhost:8080/war-reactjs-practice",
      "dependencies": {
        "react": "^16.9.0",
        "react-dom": "^16.9.0",
        "react-scripts": "3.1.1"
    ```
- npm run build 

- copy build contents to src/main/webapp

- mvn clean package && docker build -t sushilnayak/war-react .

- docker run -d -p 8080:8080 -p 9990:9990 sushilnayak/war-react

http://localhost:8080/war-reactjs-practice/