const axios = require('axios');

const 
AddOrder = async () => {
    try {
        const response = await axios.post('http://localhost:8080/api/orders', {
            customerId:'67f4eb15096d387833e28248',
            products: [
                {
                    productId: '67f9b9eef498851c6387c527',
                    quantity: 1
                },
                {
                    productId: '67f9ba1bf498851c6387c529',
                    quantity: 2
                }
            ]
        });
        console.log('Order created successfully:', response.data);
    } catch (error) {
        console.error('Error creating order:', error.response?.data || error.message);
    }
}


AddOrder();