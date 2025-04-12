const axios = require("axios");
const { name } = require("ejs");

const AddCustomer = async () => {
  try {
    const response = await axios.post("http://localhost:8080/api/customers", {
      name: "Nguyen Van A",
      address: "123 Nguyen Trai, District 1",
      phone: "0901234567",
    });
    console.log(response.data);
  } catch (error) {
    console.error(error);
  }
};

AddCustomer();
