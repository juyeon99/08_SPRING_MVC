package com.juyeon.fileupload;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class FileDTO {
    private String origFileName;
    private String saveName;
    private String filePath;
    private String fileDescription;
}
