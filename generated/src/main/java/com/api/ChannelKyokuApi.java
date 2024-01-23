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

import com.model.ChannelKyoku;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.Size;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-11-03T00:05:56.576346+09:00[Asia/Tokyo]")
@Validated
@Tag(name = "channelKyoku", description = "the channelKyoku API")
@RequestMapping("${openapi..base-path:}")
public interface ChannelKyokuApi {

    /**
     * GET /channelKyoku/{channelIds}} : チャンネル局マスタをチャンネル局IDによって取得する
     * チャンネル局マスタをチャンネル局IDによって取得する
     *
     * @param channelIds  (required)
     * @return チャンネル局マスタを正常取得 (status code 200)
     */
    @Operation(
        operationId = "getChannelKyoku",
        summary = "チャンネル局マスタをチャンネル局IDによって取得する",
        tags = { "channelKyoku" },
        responses = {
            @ApiResponse(responseCode = "200", description = "チャンネル局マスタを正常取得", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ChannelKyoku.class))
            })
        }
    )
    @GetMapping("/channelKyoku/{channelIds}")
    ResponseEntity<ChannelKyoku> getChannelKyoku(
        @Size(max = 100) @Parameter(name = "channelIds", description = "", required = true) @PathVariable("channelIds") String channelIds
    );

}