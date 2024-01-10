package com.restdemo.RestDemo.controller;

/*
* we use annotation to make this class as a contoller.
* so we use @RestController
*/

import com.restdemo.RestDemo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

/*
 * I use @RequestMapping annotation to make sure that controller class mapped with model class.
 */

@RestController
@RequestMapping("/cloudvendor")

public class CloudVendorAPIService {
/*  we want to make sure that this function will return an detail
*   so we use @GetMapping anotaion.
*/
    CloudVendor cloudVendor;

    @GetMapping("{vendorId}")
    public CloudVendor getVendorDetail(String vendorId)
    {
       /* return new CloudVendor("A1",
                               "Mohd Umair Lari",
                                "Noida Sikka Karnam",
                                            "abcdsee");*/
        return cloudVendor;
    }
    @PostMapping
    public String CreateCloudVender(@RequestBody CloudVendor cloudVendor)
    {
        this.cloudVendor = cloudVendor;
        return "cloud vender created";
    }

    @PutMapping
    public String UpdateCloudVendorDetail(@RequestBody CloudVendor cloudVendor)
    {
        this.cloudVendor = cloudVendor;
        return "Updated cloud vender created";
    }

    @DeleteMapping("{vendorId}")
    public String DeleteCloudVendor(@RequestBody CloudVendor cloudVendor)
    {
        this.cloudVendor = null;
        return "CloudVendor Deleted Sucessfully";
    }
}
