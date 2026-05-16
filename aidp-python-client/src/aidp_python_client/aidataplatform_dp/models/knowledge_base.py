# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class KnowledgeBase(object):
    """
    Description of KnowledgeBase.
    """

    #: A constant which can be used with the type property of a KnowledgeBase.
    #: This constant has a value of "NATIVE"
    TYPE_NATIVE = "NATIVE"

    #: A constant which can be used with the modality property of a KnowledgeBase.
    #: This constant has a value of "TEXT"
    MODALITY_TEXT = "TEXT"

    #: A constant which can be used with the embedding_model_source_type property of a KnowledgeBase.
    #: This constant has a value of "ADW_23_AI"
    EMBEDDING_MODEL_SOURCE_TYPE_ADW_23_AI = "ADW_23_AI"

    #: A constant which can be used with the embedding_model_source_type property of a KnowledgeBase.
    #: This constant has a value of "ADW_26_AI"
    EMBEDDING_MODEL_SOURCE_TYPE_ADW_26_AI = "ADW_26_AI"

    #: A constant which can be used with the embedding_model_source_type property of a KnowledgeBase.
    #: This constant has a value of "GEN_AI"
    EMBEDDING_MODEL_SOURCE_TYPE_GEN_AI = "GEN_AI"

    #: A constant which can be used with the vector_db_type property of a KnowledgeBase.
    #: This constant has a value of "ADW_23_AI"
    VECTOR_DB_TYPE_ADW_23_AI = "ADW_23_AI"

    #: A constant which can be used with the vector_db_type property of a KnowledgeBase.
    #: This constant has a value of "ADW_26_AI"
    VECTOR_DB_TYPE_ADW_26_AI = "ADW_26_AI"

    #: A constant which can be used with the index_type property of a KnowledgeBase.
    #: This constant has a value of "HNSW"
    INDEX_TYPE_HNSW = "HNSW"

    #: A constant which can be used with the index_type property of a KnowledgeBase.
    #: This constant has a value of "IVF"
    INDEX_TYPE_IVF = "IVF"

    #: A constant which can be used with the lifecycle_state property of a KnowledgeBase.
    #: This constant has a value of "CREATING"
    LIFECYCLE_STATE_CREATING = "CREATING"

    #: A constant which can be used with the lifecycle_state property of a KnowledgeBase.
    #: This constant has a value of "ACTIVE"
    LIFECYCLE_STATE_ACTIVE = "ACTIVE"

    #: A constant which can be used with the lifecycle_state property of a KnowledgeBase.
    #: This constant has a value of "UPDATING"
    LIFECYCLE_STATE_UPDATING = "UPDATING"

    #: A constant which can be used with the lifecycle_state property of a KnowledgeBase.
    #: This constant has a value of "DELETING"
    LIFECYCLE_STATE_DELETING = "DELETING"

    #: A constant which can be used with the lifecycle_state property of a KnowledgeBase.
    #: This constant has a value of "NEEDS_ATTENTION"
    LIFECYCLE_STATE_NEEDS_ATTENTION = "NEEDS_ATTENTION"

    #: A constant which can be used with the lifecycle_state property of a KnowledgeBase.
    #: This constant has a value of "DELETED"
    LIFECYCLE_STATE_DELETED = "DELETED"

    #: A constant which can be used with the lifecycle_state property of a KnowledgeBase.
    #: This constant has a value of "FAILED"
    LIFECYCLE_STATE_FAILED = "FAILED"

    def __init__(self, **kwargs):
        """
        Initializes a new KnowledgeBase object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param key:
            The value to assign to the key property of this KnowledgeBase.
        :type key: str

        :param display_name:
            The value to assign to the display_name property of this KnowledgeBase.
        :type display_name: str

        :param description:
            The value to assign to the description property of this KnowledgeBase.
        :type description: str

        :param catalog_key:
            The value to assign to the catalog_key property of this KnowledgeBase.
        :type catalog_key: str

        :param schema_key:
            The value to assign to the schema_key property of this KnowledgeBase.
        :type schema_key: str

        :param type:
            The value to assign to the type property of this KnowledgeBase.
            Allowed values for this property are: "NATIVE"
        :type type: str

        :param workspace_key:
            The value to assign to the workspace_key property of this KnowledgeBase.
        :type workspace_key: str

        :param cluster_key:
            The value to assign to the cluster_key property of this KnowledgeBase.
        :type cluster_key: str

        :param modality:
            The value to assign to the modality property of this KnowledgeBase.
            Allowed values for this property are: "TEXT"
        :type modality: str

        :param embedding_model_source_type:
            The value to assign to the embedding_model_source_type property of this KnowledgeBase.
            Allowed values for this property are: "ADW_23_AI", "ADW_26_AI", "GEN_AI"
        :type embedding_model_source_type: str

        :param embedding_model_name:
            The value to assign to the embedding_model_name property of this KnowledgeBase.
        :type embedding_model_name: str

        :param vector_db_type:
            The value to assign to the vector_db_type property of this KnowledgeBase.
            Allowed values for this property are: "ADW_23_AI", "ADW_26_AI"
        :type vector_db_type: str

        :param vector_table:
            The value to assign to the vector_table property of this KnowledgeBase.
        :type vector_table: str

        :param doc_table:
            The value to assign to the doc_table property of this KnowledgeBase.
        :type doc_table: str

        :param chunk_size:
            The value to assign to the chunk_size property of this KnowledgeBase.
        :type chunk_size: int

        :param chunk_overlap:
            The value to assign to the chunk_overlap property of this KnowledgeBase.
        :type chunk_overlap: int

        :param source_file_pattern:
            The value to assign to the source_file_pattern property of this KnowledgeBase.
        :type source_file_pattern: str

        :param time_last_embedding:
            The value to assign to the time_last_embedding property of this KnowledgeBase.
        :type time_last_embedding: datetime

        :param index_type:
            The value to assign to the index_type property of this KnowledgeBase.
            Allowed values for this property are: "HNSW", "IVF"
        :type index_type: str

        :param index_name:
            The value to assign to the index_name property of this KnowledgeBase.
        :type index_name: str

        :param time_last_indexing:
            The value to assign to the time_last_indexing property of this KnowledgeBase.
        :type time_last_indexing: datetime

        :param index_distance:
            The value to assign to the index_distance property of this KnowledgeBase.
        :type index_distance: str

        :param index_target_accuracy:
            The value to assign to the index_target_accuracy property of this KnowledgeBase.
        :type index_target_accuracy: int

        :param index_neighbor_partitions:
            The value to assign to the index_neighbor_partitions property of this KnowledgeBase.
        :type index_neighbor_partitions: int

        :param index_neighbors:
            The value to assign to the index_neighbors property of this KnowledgeBase.
        :type index_neighbors: int

        :param index_ef_construction:
            The value to assign to the index_ef_construction property of this KnowledgeBase.
        :type index_ef_construction: int

        :param index_neighbor_partition_probes:
            The value to assign to the index_neighbor_partition_probes property of this KnowledgeBase.
        :type index_neighbor_partition_probes: int

        :param time_created:
            The value to assign to the time_created property of this KnowledgeBase.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this KnowledgeBase.
        :type time_updated: datetime

        :param created_by:
            The value to assign to the created_by property of this KnowledgeBase.
        :type created_by: str

        :param updated_by:
            The value to assign to the updated_by property of this KnowledgeBase.
        :type updated_by: str

        :param current_processed_items:
            The value to assign to the current_processed_items property of this KnowledgeBase.
        :type current_processed_items: int

        :param lifecycle_state:
            The value to assign to the lifecycle_state property of this KnowledgeBase.
            Allowed values for this property are: "CREATING", "ACTIVE", "UPDATING", "DELETING", "NEEDS_ATTENTION", "DELETED", "FAILED"
        :type lifecycle_state: str

        :param lifecycle_state_details:
            The value to assign to the lifecycle_state_details property of this KnowledgeBase.
        :type lifecycle_state_details: str

        :param version:
            The value to assign to the version property of this KnowledgeBase.
        :type version: int

        :param sources:
            The value to assign to the sources property of this KnowledgeBase.
        :type sources: list[oci.aidataplatform_dp.models.KnowledgeBaseSourceMetadataDetails]

        :param index_details:
            The value to assign to the index_details property of this KnowledgeBase.
        :type index_details: oci.aidataplatform_dp.models.KnowledgeBaseVectorIndexDetails

        :param system_tags:
            The value to assign to the system_tags property of this KnowledgeBase.
        :type system_tags: dict(str, dict(str, object))

        """
        self.swagger_types = {
            'key': 'str',
            'display_name': 'str',
            'description': 'str',
            'catalog_key': 'str',
            'schema_key': 'str',
            'type': 'str',
            'workspace_key': 'str',
            'cluster_key': 'str',
            'modality': 'str',
            'embedding_model_source_type': 'str',
            'embedding_model_name': 'str',
            'vector_db_type': 'str',
            'vector_table': 'str',
            'doc_table': 'str',
            'chunk_size': 'int',
            'chunk_overlap': 'int',
            'source_file_pattern': 'str',
            'time_last_embedding': 'datetime',
            'index_type': 'str',
            'index_name': 'str',
            'time_last_indexing': 'datetime',
            'index_distance': 'str',
            'index_target_accuracy': 'int',
            'index_neighbor_partitions': 'int',
            'index_neighbors': 'int',
            'index_ef_construction': 'int',
            'index_neighbor_partition_probes': 'int',
            'time_created': 'datetime',
            'time_updated': 'datetime',
            'created_by': 'str',
            'updated_by': 'str',
            'current_processed_items': 'int',
            'lifecycle_state': 'str',
            'lifecycle_state_details': 'str',
            'version': 'int',
            'sources': 'list[KnowledgeBaseSourceMetadataDetails]',
            'index_details': 'KnowledgeBaseVectorIndexDetails',
            'system_tags': 'dict(str, dict(str, object))'
        }

        self.attribute_map = {
            'key': 'key',
            'display_name': 'displayName',
            'description': 'description',
            'catalog_key': 'catalogKey',
            'schema_key': 'schemaKey',
            'type': 'type',
            'workspace_key': 'workspaceKey',
            'cluster_key': 'clusterKey',
            'modality': 'modality',
            'embedding_model_source_type': 'embeddingModelSourceType',
            'embedding_model_name': 'embeddingModelName',
            'vector_db_type': 'vectorDbType',
            'vector_table': 'vectorTable',
            'doc_table': 'docTable',
            'chunk_size': 'chunkSize',
            'chunk_overlap': 'chunkOverlap',
            'source_file_pattern': 'sourceFilePattern',
            'time_last_embedding': 'timeLastEmbedding',
            'index_type': 'indexType',
            'index_name': 'indexName',
            'time_last_indexing': 'timeLastIndexing',
            'index_distance': 'indexDistance',
            'index_target_accuracy': 'indexTargetAccuracy',
            'index_neighbor_partitions': 'indexNeighborPartitions',
            'index_neighbors': 'indexNeighbors',
            'index_ef_construction': 'indexEfConstruction',
            'index_neighbor_partition_probes': 'indexNeighborPartitionProbes',
            'time_created': 'timeCreated',
            'time_updated': 'timeUpdated',
            'created_by': 'createdBy',
            'updated_by': 'updatedBy',
            'current_processed_items': 'currentProcessedItems',
            'lifecycle_state': 'lifecycleState',
            'lifecycle_state_details': 'lifecycleStateDetails',
            'version': 'version',
            'sources': 'sources',
            'index_details': 'indexDetails',
            'system_tags': 'systemTags'
        }

        self._key = None
        self._display_name = None
        self._description = None
        self._catalog_key = None
        self._schema_key = None
        self._type = None
        self._workspace_key = None
        self._cluster_key = None
        self._modality = None
        self._embedding_model_source_type = None
        self._embedding_model_name = None
        self._vector_db_type = None
        self._vector_table = None
        self._doc_table = None
        self._chunk_size = None
        self._chunk_overlap = None
        self._source_file_pattern = None
        self._time_last_embedding = None
        self._index_type = None
        self._index_name = None
        self._time_last_indexing = None
        self._index_distance = None
        self._index_target_accuracy = None
        self._index_neighbor_partitions = None
        self._index_neighbors = None
        self._index_ef_construction = None
        self._index_neighbor_partition_probes = None
        self._time_created = None
        self._time_updated = None
        self._created_by = None
        self._updated_by = None
        self._current_processed_items = None
        self._lifecycle_state = None
        self._lifecycle_state_details = None
        self._version = None
        self._sources = None
        self._index_details = None
        self._system_tags = None

    @property
    def key(self):
        """
        **[Required]** Gets the key of this KnowledgeBase.
        The Unique identifier for this KnowledgeBase resource


        :return: The key of this KnowledgeBase.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this KnowledgeBase.
        The Unique identifier for this KnowledgeBase resource


        :param key: The key of this KnowledgeBase.
        :type: str
        """
        self._key = key

    @property
    def display_name(self):
        """
        **[Required]** Gets the display_name of this KnowledgeBase.
        A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering confidential information.


        :return: The display_name of this KnowledgeBase.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this KnowledgeBase.
        A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering confidential information.


        :param display_name: The display_name of this KnowledgeBase.
        :type: str
        """
        self._display_name = display_name

    @property
    def description(self):
        """
        Gets the description of this KnowledgeBase.
        A user-friendly description about this KnowledgeBase resource


        :return: The description of this KnowledgeBase.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this KnowledgeBase.
        A user-friendly description about this KnowledgeBase resource


        :param description: The description of this KnowledgeBase.
        :type: str
        """
        self._description = description

    @property
    def catalog_key(self):
        """
        **[Required]** Gets the catalog_key of this KnowledgeBase.
        The key of the catalog containing the KnowledgeBase.


        :return: The catalog_key of this KnowledgeBase.
        :rtype: str
        """
        return self._catalog_key

    @catalog_key.setter
    def catalog_key(self, catalog_key):
        """
        Sets the catalog_key of this KnowledgeBase.
        The key of the catalog containing the KnowledgeBase.


        :param catalog_key: The catalog_key of this KnowledgeBase.
        :type: str
        """
        self._catalog_key = catalog_key

    @property
    def schema_key(self):
        """
        **[Required]** Gets the schema_key of this KnowledgeBase.
        The key of the schema containing the KnowledgeBase.


        :return: The schema_key of this KnowledgeBase.
        :rtype: str
        """
        return self._schema_key

    @schema_key.setter
    def schema_key(self, schema_key):
        """
        Sets the schema_key of this KnowledgeBase.
        The key of the schema containing the KnowledgeBase.


        :param schema_key: The schema_key of this KnowledgeBase.
        :type: str
        """
        self._schema_key = schema_key

    @property
    def type(self):
        """
        Gets the type of this KnowledgeBase.
        type of Knowledgebase

        Allowed values for this property are: "NATIVE"


        :return: The type of this KnowledgeBase.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this KnowledgeBase.
        type of Knowledgebase


        :param type: The type of this KnowledgeBase.
        :type: str
        """
        allowed_values = ["NATIVE"]
        if not value_allowed_none_or_none_sentinel(type, allowed_values):
            raise ValueError(
                "Invalid value for `type`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._type = type

    @property
    def workspace_key(self):
        """
        **[Required]** Gets the workspace_key of this KnowledgeBase.
        The id of the workspace associated with the KnowledgeBase.


        :return: The workspace_key of this KnowledgeBase.
        :rtype: str
        """
        return self._workspace_key

    @workspace_key.setter
    def workspace_key(self, workspace_key):
        """
        Sets the workspace_key of this KnowledgeBase.
        The id of the workspace associated with the KnowledgeBase.


        :param workspace_key: The workspace_key of this KnowledgeBase.
        :type: str
        """
        self._workspace_key = workspace_key

    @property
    def cluster_key(self):
        """
        **[Required]** Gets the cluster_key of this KnowledgeBase.
        The id of the cluster associated with the KnowledgeBase.


        :return: The cluster_key of this KnowledgeBase.
        :rtype: str
        """
        return self._cluster_key

    @cluster_key.setter
    def cluster_key(self, cluster_key):
        """
        Sets the cluster_key of this KnowledgeBase.
        The id of the cluster associated with the KnowledgeBase.


        :param cluster_key: The cluster_key of this KnowledgeBase.
        :type: str
        """
        self._cluster_key = cluster_key

    @property
    def modality(self):
        """
        Gets the modality of this KnowledgeBase.
        Modality of the data in this Knowledgebase

        Allowed values for this property are: "TEXT"


        :return: The modality of this KnowledgeBase.
        :rtype: str
        """
        return self._modality

    @modality.setter
    def modality(self, modality):
        """
        Sets the modality of this KnowledgeBase.
        Modality of the data in this Knowledgebase


        :param modality: The modality of this KnowledgeBase.
        :type: str
        """
        allowed_values = ["TEXT"]
        if not value_allowed_none_or_none_sentinel(modality, allowed_values):
            raise ValueError(
                "Invalid value for `modality`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._modality = modality

    @property
    def embedding_model_source_type(self):
        """
        Gets the embedding_model_source_type of this KnowledgeBase.
        Information about where embedding model is located

        Allowed values for this property are: "ADW_23_AI", "ADW_26_AI", "GEN_AI"


        :return: The embedding_model_source_type of this KnowledgeBase.
        :rtype: str
        """
        return self._embedding_model_source_type

    @embedding_model_source_type.setter
    def embedding_model_source_type(self, embedding_model_source_type):
        """
        Sets the embedding_model_source_type of this KnowledgeBase.
        Information about where embedding model is located


        :param embedding_model_source_type: The embedding_model_source_type of this KnowledgeBase.
        :type: str
        """
        allowed_values = ["ADW_23_AI", "ADW_26_AI", "GEN_AI"]
        if not value_allowed_none_or_none_sentinel(embedding_model_source_type, allowed_values):
            raise ValueError(
                "Invalid value for `embedding_model_source_type`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._embedding_model_source_type = embedding_model_source_type

    @property
    def embedding_model_name(self):
        """
        Gets the embedding_model_name of this KnowledgeBase.
        Name of the embedding model


        :return: The embedding_model_name of this KnowledgeBase.
        :rtype: str
        """
        return self._embedding_model_name

    @embedding_model_name.setter
    def embedding_model_name(self, embedding_model_name):
        """
        Sets the embedding_model_name of this KnowledgeBase.
        Name of the embedding model


        :param embedding_model_name: The embedding_model_name of this KnowledgeBase.
        :type: str
        """
        self._embedding_model_name = embedding_model_name

    @property
    def vector_db_type(self):
        """
        Gets the vector_db_type of this KnowledgeBase.
        Information about where embeddings of data are located

        Allowed values for this property are: "ADW_23_AI", "ADW_26_AI"


        :return: The vector_db_type of this KnowledgeBase.
        :rtype: str
        """
        return self._vector_db_type

    @vector_db_type.setter
    def vector_db_type(self, vector_db_type):
        """
        Sets the vector_db_type of this KnowledgeBase.
        Information about where embeddings of data are located


        :param vector_db_type: The vector_db_type of this KnowledgeBase.
        :type: str
        """
        allowed_values = ["ADW_23_AI", "ADW_26_AI"]
        if not value_allowed_none_or_none_sentinel(vector_db_type, allowed_values):
            raise ValueError(
                "Invalid value for `vector_db_type`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._vector_db_type = vector_db_type

    @property
    def vector_table(self):
        """
        Gets the vector_table of this KnowledgeBase.
        Name of the embedding table


        :return: The vector_table of this KnowledgeBase.
        :rtype: str
        """
        return self._vector_table

    @vector_table.setter
    def vector_table(self, vector_table):
        """
        Sets the vector_table of this KnowledgeBase.
        Name of the embedding table


        :param vector_table: The vector_table of this KnowledgeBase.
        :type: str
        """
        self._vector_table = vector_table

    @property
    def doc_table(self):
        """
        Gets the doc_table of this KnowledgeBase.
        Name of the table to track documents/records for which embeddings are generated


        :return: The doc_table of this KnowledgeBase.
        :rtype: str
        """
        return self._doc_table

    @doc_table.setter
    def doc_table(self, doc_table):
        """
        Sets the doc_table of this KnowledgeBase.
        Name of the table to track documents/records for which embeddings are generated


        :param doc_table: The doc_table of this KnowledgeBase.
        :type: str
        """
        self._doc_table = doc_table

    @property
    def chunk_size(self):
        """
        Gets the chunk_size of this KnowledgeBase.
        Chunk size at KnowledgeBase level which can be overridden by source level settings


        :return: The chunk_size of this KnowledgeBase.
        :rtype: int
        """
        return self._chunk_size

    @chunk_size.setter
    def chunk_size(self, chunk_size):
        """
        Sets the chunk_size of this KnowledgeBase.
        Chunk size at KnowledgeBase level which can be overridden by source level settings


        :param chunk_size: The chunk_size of this KnowledgeBase.
        :type: int
        """
        self._chunk_size = chunk_size

    @property
    def chunk_overlap(self):
        """
        Gets the chunk_overlap of this KnowledgeBase.
        Chunk Overlap at KnowledgeBase level which can be overridden by source level settings


        :return: The chunk_overlap of this KnowledgeBase.
        :rtype: int
        """
        return self._chunk_overlap

    @chunk_overlap.setter
    def chunk_overlap(self, chunk_overlap):
        """
        Sets the chunk_overlap of this KnowledgeBase.
        Chunk Overlap at KnowledgeBase level which can be overridden by source level settings


        :param chunk_overlap: The chunk_overlap of this KnowledgeBase.
        :type: int
        """
        self._chunk_overlap = chunk_overlap

    @property
    def source_file_pattern(self):
        """
        Gets the source_file_pattern of this KnowledgeBase.
        Applicable for Native KnowledgeBase where source type is KnowledgeBase


        :return: The source_file_pattern of this KnowledgeBase.
        :rtype: str
        """
        return self._source_file_pattern

    @source_file_pattern.setter
    def source_file_pattern(self, source_file_pattern):
        """
        Sets the source_file_pattern of this KnowledgeBase.
        Applicable for Native KnowledgeBase where source type is KnowledgeBase


        :param source_file_pattern: The source_file_pattern of this KnowledgeBase.
        :type: str
        """
        self._source_file_pattern = source_file_pattern

    @property
    def time_last_embedding(self):
        """
        Gets the time_last_embedding of this KnowledgeBase.
        Timestamp for last job run


        :return: The time_last_embedding of this KnowledgeBase.
        :rtype: datetime
        """
        return self._time_last_embedding

    @time_last_embedding.setter
    def time_last_embedding(self, time_last_embedding):
        """
        Sets the time_last_embedding of this KnowledgeBase.
        Timestamp for last job run


        :param time_last_embedding: The time_last_embedding of this KnowledgeBase.
        :type: datetime
        """
        self._time_last_embedding = time_last_embedding

    @property
    def index_type(self):
        """
        Gets the index_type of this KnowledgeBase.
        Type of Index if present, supported types:
        * HNSW (Hierarchical Navigable Small World)
        * IVF (Inverted File)

        Allowed values for this property are: "HNSW", "IVF"


        :return: The index_type of this KnowledgeBase.
        :rtype: str
        """
        return self._index_type

    @index_type.setter
    def index_type(self, index_type):
        """
        Sets the index_type of this KnowledgeBase.
        Type of Index if present, supported types:
        * HNSW (Hierarchical Navigable Small World)
        * IVF (Inverted File)


        :param index_type: The index_type of this KnowledgeBase.
        :type: str
        """
        allowed_values = ["HNSW", "IVF"]
        if not value_allowed_none_or_none_sentinel(index_type, allowed_values):
            raise ValueError(
                "Invalid value for `index_type`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._index_type = index_type

    @property
    def index_name(self):
        """
        Gets the index_name of this KnowledgeBase.
        Name of Index if present


        :return: The index_name of this KnowledgeBase.
        :rtype: str
        """
        return self._index_name

    @index_name.setter
    def index_name(self, index_name):
        """
        Sets the index_name of this KnowledgeBase.
        Name of Index if present


        :param index_name: The index_name of this KnowledgeBase.
        :type: str
        """
        self._index_name = index_name

    @property
    def time_last_indexing(self):
        """
        Gets the time_last_indexing of this KnowledgeBase.
        Timestamp for last index


        :return: The time_last_indexing of this KnowledgeBase.
        :rtype: datetime
        """
        return self._time_last_indexing

    @time_last_indexing.setter
    def time_last_indexing(self, time_last_indexing):
        """
        Sets the time_last_indexing of this KnowledgeBase.
        Timestamp for last index


        :param time_last_indexing: The time_last_indexing of this KnowledgeBase.
        :type: datetime
        """
        self._time_last_indexing = time_last_indexing

    @property
    def index_distance(self):
        """
        Gets the index_distance of this KnowledgeBase.
        Distance metric for the vector index


        :return: The index_distance of this KnowledgeBase.
        :rtype: str
        """
        return self._index_distance

    @index_distance.setter
    def index_distance(self, index_distance):
        """
        Sets the index_distance of this KnowledgeBase.
        Distance metric for the vector index


        :param index_distance: The index_distance of this KnowledgeBase.
        :type: str
        """
        self._index_distance = index_distance

    @property
    def index_target_accuracy(self):
        """
        Gets the index_target_accuracy of this KnowledgeBase.
        Target accuracy percentage for the index (1-100)


        :return: The index_target_accuracy of this KnowledgeBase.
        :rtype: int
        """
        return self._index_target_accuracy

    @index_target_accuracy.setter
    def index_target_accuracy(self, index_target_accuracy):
        """
        Sets the index_target_accuracy of this KnowledgeBase.
        Target accuracy percentage for the index (1-100)


        :param index_target_accuracy: The index_target_accuracy of this KnowledgeBase.
        :type: int
        """
        self._index_target_accuracy = index_target_accuracy

    @property
    def index_neighbor_partitions(self):
        """
        Gets the index_neighbor_partitions of this KnowledgeBase.
        Number of partitions (clusters) for IVF index


        :return: The index_neighbor_partitions of this KnowledgeBase.
        :rtype: int
        """
        return self._index_neighbor_partitions

    @index_neighbor_partitions.setter
    def index_neighbor_partitions(self, index_neighbor_partitions):
        """
        Sets the index_neighbor_partitions of this KnowledgeBase.
        Number of partitions (clusters) for IVF index


        :param index_neighbor_partitions: The index_neighbor_partitions of this KnowledgeBase.
        :type: int
        """
        self._index_neighbor_partitions = index_neighbor_partitions

    @property
    def index_neighbors(self):
        """
        Gets the index_neighbors of this KnowledgeBase.
        Maximum number of neighbors for HNSW index


        :return: The index_neighbors of this KnowledgeBase.
        :rtype: int
        """
        return self._index_neighbors

    @index_neighbors.setter
    def index_neighbors(self, index_neighbors):
        """
        Sets the index_neighbors of this KnowledgeBase.
        Maximum number of neighbors for HNSW index


        :param index_neighbors: The index_neighbors of this KnowledgeBase.
        :type: int
        """
        self._index_neighbors = index_neighbors

    @property
    def index_ef_construction(self):
        """
        Gets the index_ef_construction of this KnowledgeBase.
        Maximum number of closest vector candidates for HNSW index construction


        :return: The index_ef_construction of this KnowledgeBase.
        :rtype: int
        """
        return self._index_ef_construction

    @index_ef_construction.setter
    def index_ef_construction(self, index_ef_construction):
        """
        Sets the index_ef_construction of this KnowledgeBase.
        Maximum number of closest vector candidates for HNSW index construction


        :param index_ef_construction: The index_ef_construction of this KnowledgeBase.
        :type: int
        """
        self._index_ef_construction = index_ef_construction

    @property
    def index_neighbor_partition_probes(self):
        """
        Gets the index_neighbor_partition_probes of this KnowledgeBase.
        Maximum number of partitions to probe for IVF index


        :return: The index_neighbor_partition_probes of this KnowledgeBase.
        :rtype: int
        """
        return self._index_neighbor_partition_probes

    @index_neighbor_partition_probes.setter
    def index_neighbor_partition_probes(self, index_neighbor_partition_probes):
        """
        Sets the index_neighbor_partition_probes of this KnowledgeBase.
        Maximum number of partitions to probe for IVF index


        :param index_neighbor_partition_probes: The index_neighbor_partition_probes of this KnowledgeBase.
        :type: int
        """
        self._index_neighbor_partition_probes = index_neighbor_partition_probes

    @property
    def time_created(self):
        """
        **[Required]** Gets the time_created of this KnowledgeBase.
        Timestamp when KnowledgeBase was created


        :return: The time_created of this KnowledgeBase.
        :rtype: datetime
        """
        return self._time_created

    @time_created.setter
    def time_created(self, time_created):
        """
        Sets the time_created of this KnowledgeBase.
        Timestamp when KnowledgeBase was created


        :param time_created: The time_created of this KnowledgeBase.
        :type: datetime
        """
        self._time_created = time_created

    @property
    def time_updated(self):
        """
        Gets the time_updated of this KnowledgeBase.
        Timestamp when KnowledgeBase was updated


        :return: The time_updated of this KnowledgeBase.
        :rtype: datetime
        """
        return self._time_updated

    @time_updated.setter
    def time_updated(self, time_updated):
        """
        Sets the time_updated of this KnowledgeBase.
        Timestamp when KnowledgeBase was updated


        :param time_updated: The time_updated of this KnowledgeBase.
        :type: datetime
        """
        self._time_updated = time_updated

    @property
    def created_by(self):
        """
        **[Required]** Gets the created_by of this KnowledgeBase.
        Identifier for KnowledgeBase creator


        :return: The created_by of this KnowledgeBase.
        :rtype: str
        """
        return self._created_by

    @created_by.setter
    def created_by(self, created_by):
        """
        Sets the created_by of this KnowledgeBase.
        Identifier for KnowledgeBase creator


        :param created_by: The created_by of this KnowledgeBase.
        :type: str
        """
        self._created_by = created_by

    @property
    def updated_by(self):
        """
        Gets the updated_by of this KnowledgeBase.
        Identifier for principal who updated the KnowledgeBase


        :return: The updated_by of this KnowledgeBase.
        :rtype: str
        """
        return self._updated_by

    @updated_by.setter
    def updated_by(self, updated_by):
        """
        Sets the updated_by of this KnowledgeBase.
        Identifier for principal who updated the KnowledgeBase


        :param updated_by: The updated_by of this KnowledgeBase.
        :type: str
        """
        self._updated_by = updated_by

    @property
    def current_processed_items(self):
        """
        Gets the current_processed_items of this KnowledgeBase.
        Count of items/documents processed by KB for which embeddings are present


        :return: The current_processed_items of this KnowledgeBase.
        :rtype: int
        """
        return self._current_processed_items

    @current_processed_items.setter
    def current_processed_items(self, current_processed_items):
        """
        Sets the current_processed_items of this KnowledgeBase.
        Count of items/documents processed by KB for which embeddings are present


        :param current_processed_items: The current_processed_items of this KnowledgeBase.
        :type: int
        """
        self._current_processed_items = current_processed_items

    @property
    def lifecycle_state(self):
        """
        Gets the lifecycle_state of this KnowledgeBase.
        Lifecycle of KnowledgeBase

        Allowed values for this property are: "CREATING", "ACTIVE", "UPDATING", "DELETING", "NEEDS_ATTENTION", "DELETED", "FAILED"


        :return: The lifecycle_state of this KnowledgeBase.
        :rtype: str
        """
        return self._lifecycle_state

    @lifecycle_state.setter
    def lifecycle_state(self, lifecycle_state):
        """
        Sets the lifecycle_state of this KnowledgeBase.
        Lifecycle of KnowledgeBase


        :param lifecycle_state: The lifecycle_state of this KnowledgeBase.
        :type: str
        """
        allowed_values = ["CREATING", "ACTIVE", "UPDATING", "DELETING", "NEEDS_ATTENTION", "DELETED", "FAILED"]
        if not value_allowed_none_or_none_sentinel(lifecycle_state, allowed_values):
            raise ValueError(
                "Invalid value for `lifecycle_state`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._lifecycle_state = lifecycle_state

    @property
    def lifecycle_state_details(self):
        """
        Gets the lifecycle_state_details of this KnowledgeBase.
        Additional information about the current state of KnowledgeBase


        :return: The lifecycle_state_details of this KnowledgeBase.
        :rtype: str
        """
        return self._lifecycle_state_details

    @lifecycle_state_details.setter
    def lifecycle_state_details(self, lifecycle_state_details):
        """
        Sets the lifecycle_state_details of this KnowledgeBase.
        Additional information about the current state of KnowledgeBase


        :param lifecycle_state_details: The lifecycle_state_details of this KnowledgeBase.
        :type: str
        """
        self._lifecycle_state_details = lifecycle_state_details

    @property
    def version(self):
        """
        Gets the version of this KnowledgeBase.
        Version to track schemas of Embedding and Doc table


        :return: The version of this KnowledgeBase.
        :rtype: int
        """
        return self._version

    @version.setter
    def version(self, version):
        """
        Sets the version of this KnowledgeBase.
        Version to track schemas of Embedding and Doc table


        :param version: The version of this KnowledgeBase.
        :type: int
        """
        self._version = version

    @property
    def sources(self):
        """
        Gets the sources of this KnowledgeBase.
        Source information


        :return: The sources of this KnowledgeBase.
        :rtype: list[oci.aidataplatform_dp.models.KnowledgeBaseSourceMetadataDetails]
        """
        return self._sources

    @sources.setter
    def sources(self, sources):
        """
        Sets the sources of this KnowledgeBase.
        Source information


        :param sources: The sources of this KnowledgeBase.
        :type: list[oci.aidataplatform_dp.models.KnowledgeBaseSourceMetadataDetails]
        """
        self._sources = sources

    @property
    def index_details(self):
        """
        Gets the index_details of this KnowledgeBase.

        :return: The index_details of this KnowledgeBase.
        :rtype: oci.aidataplatform_dp.models.KnowledgeBaseVectorIndexDetails
        """
        return self._index_details

    @index_details.setter
    def index_details(self, index_details):
        """
        Sets the index_details of this KnowledgeBase.

        :param index_details: The index_details of this KnowledgeBase.
        :type: oci.aidataplatform_dp.models.KnowledgeBaseVectorIndexDetails
        """
        self._index_details = index_details

    @property
    def system_tags(self):
        """
        Gets the system_tags of this KnowledgeBase.
        System tags for this resource. Each key is predefined and scoped to a namespace.

        Example: `{\"orcl-cloud\": {\"free-tier-retained\": \"true\"}}`


        :return: The system_tags of this KnowledgeBase.
        :rtype: dict(str, dict(str, object))
        """
        return self._system_tags

    @system_tags.setter
    def system_tags(self, system_tags):
        """
        Sets the system_tags of this KnowledgeBase.
        System tags for this resource. Each key is predefined and scoped to a namespace.

        Example: `{\"orcl-cloud\": {\"free-tier-retained\": \"true\"}}`


        :param system_tags: The system_tags of this KnowledgeBase.
        :type: dict(str, dict(str, object))
        """
        self._system_tags = system_tags

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
