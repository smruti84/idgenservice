package com.skp.IdGeneration.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.skp.IdGeneration.model.GeneratedID;
import com.skp.IdGeneration.model.IdGeneration;
import com.skp.IdGeneration.model.MyHTTPServletRequestWrapper;
import com.skp.IdGeneration.service.IdGenerationService;

@RestController
public class IdGenerationController {
	@Autowired
	IdGenerationService idGenerationService;

	@GetMapping(path = "/id")
	public List<GeneratedID> getGeneratedIds(@RequestParam(value = "count", defaultValue = "1") int count) {
		List<GeneratedID> ids = new ArrayList<>();
		ids = idGenerationService.getIds();
		return ids;

	}

	@GetMapping(path = "/id/history/{type}")
	public List<GeneratedID> getGeneratedHistory(@PathVariable(value = "type") long type,
			@RequestParam(value = "limit", defaultValue = "10") String limit) {
		List<GeneratedID> ids = new ArrayList<>();
		ids = idGenerationService.getIds(limit);
		return ids;

	}

	/*
	 * @GetMapping(path = "/id", produces = MediaType.APPLICATION_JSON_VALUE) public
	 * List<GeneratedID> getGeneratedIds(@RequestParam(value = "requestId") String
	 * requestId) { List<GeneratedID> ids = new ArrayList<>(); ids =
	 * idGenerationService.getIds(requestId); return ids;
	 * 
	 * }
	 */

	@PostMapping("/id")
	public ResponseEntity<?> genarateIds(@RequestBody IdGeneration generatedIds, HttpServletRequest request) {

		/*
		 * MyHTTPServletRequestWrapper wrappedRequest = (WGHTTPServletRequestWrapper)
		 * request; System.out.println(wrappedRequest.getUUID());
		 */
		 
		
		  String traceID = UUID.randomUUID().toString(); MDC.put("RequestId" ,
		  traceID);
		 
		List<Long> idVals = new ArrayList<>();
		int count = generatedIds.getCount();
		for (int i = 1; i <= count; i++) {
			long val = ThreadLocalRandom.current().nextLong(1000, 9999);
			idVals.add(val);
		}
		System.out.println(idVals);
		// idGenerationService.save();
		return null;

	}

}
