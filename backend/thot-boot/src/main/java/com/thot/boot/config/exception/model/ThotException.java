package com.thot.boot.config.exception.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.thot.boot.config.exception.model.error.ThotError;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
public class ThotException { //TODO: 01/09/2021 Best name exception

        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
        private LocalDateTime timestamp;

        private ThotError error;

        private List<String> errors;

        public ThotException(ThotError thotError, List<String> errors) {
            this.timestamp = LocalDateTime.now();
            this.error = thotError;
        }
}
