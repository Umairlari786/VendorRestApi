# Cloud Vendor API Service 
## SCREENSHOT:
![CRUD SS](https://github.com/Umairlari786/VendorRestApi/assets/72033546/7dcde42b-4d59-4bc6-8368-0699c5be2f11)


## Description:
### This repository contains a simple Spring Boot application that provides RESTful API endpoints for managing Cloud Vendors. It includes a controller class, CloudVendorAPIService, and a model class, CloudVendor.
## Controller Class: CloudVendorAPIService:
### 1. Retrieve Cloud Vendor Details
Endpoint: GET /cloudvendor/{vendorId}
Description: Retrieves details of a specific Cloud Vendor based on the provided vendorId.
Example Usage:
bash
Copy code
GET /cloudvendor/A1
2. Create Cloud Vendor
Endpoint: POST /cloudvendor
Description: Creates a new Cloud Vendor using the provided JSON payload in the request body.
Example Usage:
bash
Copy code
POST /cloudvendor
Request Body:
{
  "vendorId": "A1",
  "vendorName": "Mohd Umair Lari",
  "vendorAddress": "Noida Sikka Karnam",
  "vendorPhoneNumber": "abcdsee"
}
3. Update Cloud Vendor Details
Endpoint: PUT /cloudvendor
Description: Updates the details of an existing Cloud Vendor using the provided JSON payload in the request body.
Example Usage:
bash
Copy code
PUT /cloudvendor
Request Body:
{
  "vendorId": "A1",
  "vendorName": "Updated Vendor Name",
  "vendorAddress": "Updated Vendor Address",
  "vendorPhoneNumber": "updatedPhoneNumber"
}
4. Delete Cloud Vendor
Endpoint: DELETE /cloudvendor/{vendorId}
Description: Deletes a specific Cloud Vendor based on the provided vendorId.
