const axios = require('axios');

const GetCustomer = async () => {
    try {
        const response = await axios.get('http://localhost:8080/api/customers');
        console.log(response.data);
    } catch (error) {
        console.error(error);
    }
}

GetCustomer();