package moe.src.leyline.interfaces.rest;

import org.springframework.web.bind.annotation.RestController;

import moe.src.leyline.framework.interfaces.vc.error.ErrorBrief;
import moe.src.leyline.framework.interfaces.vc.error.LeylineErrorController;

/**
 * Created by POJO on 6/16/16.
 */
@RestController
public class ErrorController extends LeylineErrorController {
    @Override
    public String genericError(ErrorBrief eb){
        return eb.toString();
    }
}