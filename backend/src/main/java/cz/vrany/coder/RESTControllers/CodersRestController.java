/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.vrany.coder.RESTControllers;

import cz.vrany.coder.Dtos.DtoCoder;
import cz.vrany.coder.Entities.Coder;
import cz.vrany.coder.Entities.AlphabetCoder;
import cz.vrany.coder.Entities.Morse;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Trida obsahuje tabulku vsech moznych kodovani poskytovanych jako sluzby
 *
 * @author michal
 */
@RestController()
public class CodersRestController {

    HashMap<String, Coder> coders = new HashMap<>();

    public CodersRestController() {
        coders.put("morse", new AlphabetCoder("Morseova abeceda", "Kodovani Morseovou abecedou", Morse.codePage));
    }

    @GetMapping(path = "/api/coders")
    public List<String> getCoders() {
        return Arrays.asList(coders.keySet().toArray(new String[0]));
    }

    @GetMapping(path = "/api/coders/{coder}/direct")
    public HashMap<String, String> getDirectCodePage(@PathVariable String coder) {
        Coder lcoder = coders.get(coder);
        if (lcoder != null) {
            return lcoder.getDirectCodePage();
        }
        return null;
    }

    @GetMapping(path = "/api/coders/{coder}/reverse")
    public HashMap<String, String> getReverseCodePage(@PathVariable String coder) {
        Coder lcoder = coders.get(coder);
        if (lcoder != null) {
            return lcoder.getReverseCodePage();
        }
        return null;
    }

    @GetMapping(path = "/api/coders/{coder}/advice")
    public HashMap<String, String> getDirectAdviceCodePage(@PathVariable String coder) {
        Coder lcoder = coders.get(coder);
        if (lcoder != null) {
            return lcoder.getDirectAdviceCodePage();
        }
        return null;
    }

    @PostMapping(path = "/api/coders/{coder}/encode")
    public ResponseEntity<?> encodeString(@PathVariable String coder, @RequestBody DtoCoder request) {
        if (request.getReq() != null) {
            Coder lcoder = coders.get(coder);
            if (lcoder != null) {
                String result = lcoder.encode(request.getReq());
                return ResponseEntity.ok(result);
            }
            return ResponseEntity.badRequest().body("Wrong coder");
        }
        return ResponseEntity.badRequest().body("No input given");
    }

    @PostMapping(path = "/api/coders/{coder}/decode")
    public ResponseEntity<?> decodeString(@PathVariable String coder, @RequestBody DtoCoder request) {
        if (request.getReq() != null) {
            Coder lcoder = coders.get(coder);
            if (lcoder != null) {
                String result = lcoder.decode(request.getReq());
                return ResponseEntity.ok(result);
            }
            return ResponseEntity.badRequest().body("Wrong coder");
        }
        return ResponseEntity.badRequest().body("No input given");
    }

}
