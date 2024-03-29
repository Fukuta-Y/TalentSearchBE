/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.api;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.OnAirKanriRefList;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T15:07:09.687667+09:00[Asia/Tokyo]")
@Validated
@Tag(name = "onAirKanriRef", description = "the onAirKanriRef API")
@RequestMapping("${openapi..base-path:}")
public interface OnAirKanriRefApi {

    /**
     * GET /onAirKanriRef : ID、オンエア日によってオンエア管理情報を返す
     * ID、オンエア日によってオンエア管理情報を返す
     *
     * @param id ID (optional)
     * @param onAirDay オンエア日 (optional)
     * @return オンエア管理情報を正常取得 (status code 200)
     */
    @Operation(
        operationId = "getOnAirKanriRef",
        summary = "ID、オンエア日によってオンエア管理情報を返す",
        tags = { "onAirKanriRef" },
        responses = {
            @ApiResponse(responseCode = "200", description = "オンエア管理情報を正常取得", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = OnAirKanriRefList.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/onAirKanriRef",
        produces = { "application/json" }
    )
    ResponseEntity<OnAirKanriRefList> getOnAirKanriRef(
        @Size(max = 8) @Parameter(name = "id", description = "ID") @Valid @RequestParam(value = "id", required = false) String id,
        @Parameter(name = "onAirDay", description = "オンエア日") @Valid @RequestParam(value = "onAirDay", required = false) String onAirDay
    );

}
