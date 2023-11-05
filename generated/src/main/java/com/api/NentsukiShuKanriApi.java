/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.api;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.MNentsukiShuKanri;
import com.model.NentsukiShuKanri;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-11-05T13:00:58.990819+09:00[Asia/Tokyo]")
@Validated
@Tag(name = "nentsukiShuKanri", description = "the nentsukiShuKanri API")
@RequestMapping("${openapi..base-path:}")
public interface NentsukiShuKanriApi {

    /**
     * GET /nentsukiShuKanri : 年月週管理マスタを返す
     * 年月週管理マスタ情報を返す
     *
     * @return 年月週管理マスタDTOの情報 (status code 200)
     */
    @Operation(
        operationId = "getNentsukiShuKanri",
        summary = "年月週管理マスタを返す",
        tags = { "nentsukiShuKanri" },
        responses = {
            @ApiResponse(responseCode = "200", description = "年月週管理マスタDTOの情報", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = NentsukiShuKanri.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/nentsukiShuKanri",
        produces = { "application/json" }
    )
    ResponseEntity<NentsukiShuKanri> getNentsukiShuKanri(
        
    );


    /**
     * POST /nentsukiShuKanri : 年月週管理マスタ情報を登録または更新する
     * 年月週管理マスタ情報を登録または更新する
     *
     * @param mnentsukiShuKanri 年月週管理マスタ情報を登録または更新する (optional)
     * @return 登録または更新した年月週管理マスタDTOの情報 (status code 200)
     */
    @Operation(
        operationId = "postProgramTorokuKoshin",
        summary = "年月週管理マスタ情報を登録または更新する",
        tags = { "nentsukiShuKanri" },
        responses = {
            @ApiResponse(responseCode = "200", description = "登録または更新した年月週管理マスタDTOの情報", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = NentsukiShuKanri.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/nentsukiShuKanri",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<NentsukiShuKanri> postProgramTorokuKoshin(
        @Parameter(name = "MNentsukiShuKanri", description = "年月週管理マスタ情報を登録または更新する") @Valid @RequestBody(required = false) MNentsukiShuKanri mnentsukiShuKanri
    );

}
