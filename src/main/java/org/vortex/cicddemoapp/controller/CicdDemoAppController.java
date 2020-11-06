package org.vortex.cicddemoapp.controller;

import org.springframework.web.bind.annotation.*;
import org.vortex.cicddemoapp.entity.Vitals;

import java.io.IOException;
import java.net.InetAddress;
import java.nio.file.*;

@RestController
public class CicdDemoAppController {

    private static final String template = "Hello, %s!";

    @GetMapping("/greeting")
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        System.out.println("---------->");
        try {
            String ip = InetAddress.getLocalHost().getHostAddress();
            return new StringBuilder().append("Hello ").append(name).append("...!, From: ").append(ip).toString();
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    @PostMapping("/vitals")
    public void vitals(@RequestBody Vitals vitals) {
        try {
            Path filePath = Paths.get("vitals.txt");
            if (!Files.exists(filePath, LinkOption.NOFOLLOW_LINKS))
                Files.createFile(filePath);
            Files.write(filePath, (vitals.toString() + "\n").getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("IOException occurred ==>"+ e.getCause());
        } catch (Exception e) {
            System.out.println("Exception occurred ==>"+ e.getCause());
        }
    }

}
