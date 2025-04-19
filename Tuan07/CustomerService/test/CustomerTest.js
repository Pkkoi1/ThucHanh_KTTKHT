const axios = require("axios");

const CustomerTest = async () => {
  try {
    const response = await axios.post("http://localhost:3001/api/customers", {
      name: "Pham Dang Khoi",
      address: "Phuong 4, Go Vap",
      phone: "0333319121",
      email: "khoi12345@gmail.com",
    });
    console.log(response.data);
  } catch (error) {
    console.error(error);
  }
};

CustomerTest();
