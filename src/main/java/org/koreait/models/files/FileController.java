package org.koreait.models.files;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@RequestMapping("/file")
public class FileController {

    private final FileUploadService uploadService;
    private final FileDownloadService downloadService;

    @PostMapping("/upload")
    public ResponseEntity<JSON>
}
