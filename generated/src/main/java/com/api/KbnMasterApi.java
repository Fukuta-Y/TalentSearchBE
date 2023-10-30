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

import com.model.KbnMasterInfo;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.Size;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-30T21:54:16.344521+09:00[Asia/Tokyo]")
@Validated
@Tag(name = "kbnMaster", description = "the kbnMaster API")
@RequestMapping("${openapi..base-path:}")
public interface KbnMasterApi {

    /**
     * GET /kbnMaster/{genreIds}} : 区分マスタをジャンルIDによって取得する
     * 区分マスタをジャンルIDによって取得する
     *
     * @param genreIds  (required)
     * @return 区分マスタを正常取得 (status code 200)
     */
    @Operation(
        operationId = "getKbnMaster",
        summary = "区分マスタをジャンルIDによって取得する",
        tags = { "kbnMaster" },
        responses = {
            @ApiResponse(responseCode = "200", description = "区分マスタを正常取得", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = KbnMasterInfo.class))
            })
        }
    )
    @GetMapping("/kbnMaster/{genreIds}")
    ResponseEntity<KbnMasterInfo> getKbnMaster(
        @Size(max = 8) @Parameter(name = "genreIds", description = "", required = true) @PathVariable("genreIds") String genreIds
    );

}
