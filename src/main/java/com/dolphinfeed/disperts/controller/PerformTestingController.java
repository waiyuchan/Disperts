package com.dolphinfeed.disperts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping("/api/v1/perform_test")
public class PerformTestingController {

    @Autowired
    private PerformTestingService PerformTestingService;

    @PostMapping
    public ResponseEntity<PerformTestCreateResponse> createPerformTest(@RequestHeader("Authorization") String authToken,
                                                                       @RequestBody PerformTestCreateRequest request) {
        try {
            int PerformTestId = PerformTestingService.createPerformTest(authToken, request);
            return ResponseEntity.ok(new PerformTestCreateResponse(PerformTestId));
        } catch (InvalidAuthTokenException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        } catch (InvalidPerformTestRequestException e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @PostMapping("/{PerformTestId}/start")
    public ResponseEntity<?> startPerformTest(@RequestHeader("Authorization") String authToken,
                                              @PathVariable int PerformTestId) {
        try {
            PerformTestingService.startPerformTest(authToken, PerformTestId);
            return ResponseEntity.ok().build();
        } catch (InvalidAuthTokenException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        } catch (PerformTestNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/{PerformTestId}/stop")
    public ResponseEntity<?> stopPerformTest(@RequestHeader("Authorization") String authToken,
                                             @PathVariable int PerformTestId) {
        try {
            PerformTestingService.stopPerformTest(authToken, PerformTestId);
            return ResponseEntity.ok().build();
        } catch (InvalidAuthTokenException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        } catch (PerformTestNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/{PerformTestId}/status")
    public ResponseEntity<PerformTestStatusResponse> getPerformTestStatus(@RequestHeader("Authorization") String authToken,
                                                                          @PathVariable int PerformTestId) {
        try {
            PerformTestStatus status = PerformTestingService.getPerformTestStatus(authToken, PerformTestId);
            return ResponseEntity.ok(new PerformTestStatusResponse(status));
        } catch (InvalidAuthTokenException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        } catch (PerformTestNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/{PerformTestId}/logs")
    public ResponseEntity<?> getPerformTestLogs(@RequestHeader("Authorization") String authToken,
                                                @PathVariable int PerformTestId, HttpServletResponse response) {
        try {
            PerformTestingService.getPerformTestLogs(authToken, PerformTestId, response);
            return null;
        } catch (InvalidAuthTokenException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        } catch (PerformTestNotFoundException e) {
            return ResponseEntity.notFound().build();
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/{loadTestId}/report")
    public ResponseEntity<?> getLoadTestReport(@RequestHeader("Authorization") String authToken,
                                               @PathVariable int PerformTestId) {
        try {
            PerformTestingService.getPerformTestReport(authToken, PerformTestId);
            return null;
        } catch (InvalidAuthTokenException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        } catch (PerformTestNotFoundException e) {
            return ResponseEntity.notFound().build();
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

}