// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vss.proto

package org.vss;

public interface DeleteObjectRequestOrBuilder extends
		// @@protoc_insertion_point(interface_extends:vss.DeleteObjectRequest)
		com.google.protobuf.MessageOrBuilder {

	/**
	 * <pre>
	 * `store_id` is a keyspace identifier.
	 * Ref: https://en.wikipedia.org/wiki/Keyspace_(distributed_data_store)
	 * All APIs operate within a single `store_id`.
	 * It is up to clients to use single or multiple stores for their use-case.
	 * This can be used for client-isolation/ rate-limiting / throttling on the server-side.
	 * Authorization and billing can also be performed at the `store_id` level.
	 * </pre>
	 *
	 * <code>string store_id = 1;</code>
	 *
	 * @return The storeId.
	 */
	java.lang.String getStoreId();

	/**
	 * <pre>
	 * `store_id` is a keyspace identifier.
	 * Ref: https://en.wikipedia.org/wiki/Keyspace_(distributed_data_store)
	 * All APIs operate within a single `store_id`.
	 * It is up to clients to use single or multiple stores for their use-case.
	 * This can be used for client-isolation/ rate-limiting / throttling on the server-side.
	 * Authorization and billing can also be performed at the `store_id` level.
	 * </pre>
	 *
	 * <code>string store_id = 1;</code>
	 *
	 * @return The bytes for storeId.
	 */
	com.google.protobuf.ByteString
	getStoreIdBytes();

	/**
	 * <pre>
	 * Item to be deleted as a result of this `DeleteObjectRequest`.
	 * An item consists of a `key` and its corresponding `version`.
	 * Key-level Versioning (Conditional Delete):
	 *   The item is only deleted if the current database version against the `key` is the same as
	 *   the `version` specified in the request.
	 * Skipping key-level versioning (Non-conditional Delete):
	 *   If you wish to skip key-level version checks, set the `version` against the `key` to '-1'.
	 *   This will perform a non-conditional delete query.
	 * This operation is idempotent, that is, multiple delete calls for the same item will not fail.
	 * If the requested item does not exist, this operation will not fail.
	 * If you wish to perform stricter checks while deleting an item, consider using `PutObject` API.
	 * </pre>
	 *
	 * <code>.vss.KeyValue key_value = 2;</code>
	 *
	 * @return Whether the keyValue field is set.
	 */
	boolean hasKeyValue();

	/**
	 * <pre>
	 * Item to be deleted as a result of this `DeleteObjectRequest`.
	 * An item consists of a `key` and its corresponding `version`.
	 * Key-level Versioning (Conditional Delete):
	 *   The item is only deleted if the current database version against the `key` is the same as
	 *   the `version` specified in the request.
	 * Skipping key-level versioning (Non-conditional Delete):
	 *   If you wish to skip key-level version checks, set the `version` against the `key` to '-1'.
	 *   This will perform a non-conditional delete query.
	 * This operation is idempotent, that is, multiple delete calls for the same item will not fail.
	 * If the requested item does not exist, this operation will not fail.
	 * If you wish to perform stricter checks while deleting an item, consider using `PutObject` API.
	 * </pre>
	 *
	 * <code>.vss.KeyValue key_value = 2;</code>
	 *
	 * @return The keyValue.
	 */
	org.vss.KeyValue getKeyValue();

	/**
	 * <pre>
	 * Item to be deleted as a result of this `DeleteObjectRequest`.
	 * An item consists of a `key` and its corresponding `version`.
	 * Key-level Versioning (Conditional Delete):
	 *   The item is only deleted if the current database version against the `key` is the same as
	 *   the `version` specified in the request.
	 * Skipping key-level versioning (Non-conditional Delete):
	 *   If you wish to skip key-level version checks, set the `version` against the `key` to '-1'.
	 *   This will perform a non-conditional delete query.
	 * This operation is idempotent, that is, multiple delete calls for the same item will not fail.
	 * If the requested item does not exist, this operation will not fail.
	 * If you wish to perform stricter checks while deleting an item, consider using `PutObject` API.
	 * </pre>
	 *
	 * <code>.vss.KeyValue key_value = 2;</code>
	 */
	org.vss.KeyValueOrBuilder getKeyValueOrBuilder();
}
