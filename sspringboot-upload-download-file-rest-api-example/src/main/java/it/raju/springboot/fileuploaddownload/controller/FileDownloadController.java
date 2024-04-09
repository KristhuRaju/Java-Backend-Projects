package it.raju.springboot.fileuploaddownload.controller;

import java.io.IOException;
import java.util.logging.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import it.raju.springboot.fileuploaddownload.service.FileStorageService;
import jakarta.servlet.http.HttpServletRequest;

@RestController
public class FileDownloadController {

	  private static final Logger logger = (Logger) LoggerFactory.getLogger(FileDownloadController.class);
	  
	  @Autowired
	  private FileStorageService fileStorageService;
	  
	  @GetMapping("/downloadFile/{fileName:.+}")
	  public ResponseEntity<Resource> downloadFile(@PathVariable  String fileName,HttpServletRequest request){
		  
		  Resource resource= (Resource) fileStorageService.loadFileAsResource(fileName);
		  
		// Try to determine file's content type
	        String contentType = null;
	        
	        try {
	        	contentType=request.getServletContext().getMimeType(resource.getFile().getAbsolutePath());
	        }catch (IOException ex) {
	            logger.info("Could not determine file type.");
	        }
	        
	        // Fallback to the default content type if type could not be determined
	        if (contentType == null) {
	            contentType = "application/octet-stream";
	        }
	        return ResponseEntity.ok()
	                .contentType(MediaType.parseMediaType(contentType))
	                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
	                .body(resource);
	        }
	  
}
