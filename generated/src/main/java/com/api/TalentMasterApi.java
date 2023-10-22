/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.api;

import com.model.MTalent;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-22T20:07:51.984801+09:00[Asia/Tokyo]")
@Validated
@Tag(name = "talentMaster", description = "the talentMaster API")
@RequestMapping("${openapi..base-path:}")
public interface TalentMasterApi {

    /**
     * GET /talentMaster/{talentId} : タレントIDによってタレントマスタを返す
     * タレントIDによってタレントマスタを返す
     *
     * @param talentId  (required)
     * @return タレントマスタDTOの情報を正常取得 (status code 200)
     */
    @Operation(
        operationId = "getTalentMaster",
        summary = "タレントIDによってタレントマスタを返す",
        tags = { "talentMaster" },
        responses = {
            @ApiResponse(responseCode = "200", description = "タレントマスタDTOの情報を正常取得", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = MTalent.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/talentMaster/{talentId}",
        produces = { "application/json" }
    )
    ResponseEntity<MTalent> getTalentMaster(
        @Size(max = 8) @Parameter(name = "talentId", description = "", required = true) @PathVariable("talentId") String talentId
    );

}