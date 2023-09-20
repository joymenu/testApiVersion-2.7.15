package com.joymenu.testapiversion;

import com.joymenu.testapiversion.annotation.ApiVersion;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author buxg
 * @version 1.0
 * @description TestController
 * @date 2023/9/19 15:20
 */
@RestController
@ApiVersion
@RequestMapping("api/{version}/")
public class TestController {

    @GetMapping(value = "/getParentCategory")
    String getParentCategory() {
        return "getParentCategory";
    }

    @ApiVersion(2)
    @GetMapping(value = "/getParentCategory")
    public String test02(@PathVariable String version) {
        return "test02 : " + version;
    }
}
