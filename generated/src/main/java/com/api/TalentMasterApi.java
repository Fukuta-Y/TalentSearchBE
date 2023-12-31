/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.api;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.TalentList;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.Size;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-11-04T18:06:10.497854+09:00[Asia/Tokyo]")
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
                @Content(mediaType = "application/json", schema = @Schema(implementation = TalentList.class))
            })
        }
    )
    @GetMapping("/talentMaster/{talentId}")
    ResponseEntity<TalentList> getTalentMaster(
        @Size(max = 8) @Parameter(name = "talentId", description = "", required = true) @PathVariable("talentId") String talentId
    );

}
