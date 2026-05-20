# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CreateKnowledgeBaseDetails(object):
    """
    The information about new KnowledgeBase.
    """

    #: A constant which can be used with the type property of a CreateKnowledgeBaseDetails.
    #: This constant has a value of "NATIVE"
    TYPE_NATIVE = "NATIVE"

    #: A constant which can be used with the modality property of a CreateKnowledgeBaseDetails.
    #: This constant has a value of "TEXT"
    MODALITY_TEXT = "TEXT"

    #: A constant which can be used with the embedding_model_source_type property of a CreateKnowledgeBaseDetails.
    #: This constant has a value of "ADW_23_AI"
    EMBEDDING_MODEL_SOURCE_TYPE_ADW_23_AI = "ADW_23_AI"

    #: A constant which can be used with the embedding_model_source_type property of a CreateKnowledgeBaseDetails.
    #: This constant has a value of "ADW_26_AI"
    EMBEDDING_MODEL_SOURCE_TYPE_ADW_26_AI = "ADW_26_AI"

    #: A constant which can be used with the embedding_model_source_type property of a CreateKnowledgeBaseDetails.
    #: This constant has a value of "GEN_AI"
    EMBEDDING_MODEL_SOURCE_TYPE_GEN_AI = "GEN_AI"

    def __init__(self, **kwargs):
        """
        Initializes a new CreateKnowledgeBaseDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param display_name:
            The value to assign to the display_name property of this CreateKnowledgeBaseDetails.
        :type display_name: str

        :param description:
            The value to assign to the description property of this CreateKnowledgeBaseDetails.
        :type description: str

        :param catalog_key:
            The value to assign to the catalog_key property of this CreateKnowledgeBaseDetails.
        :type catalog_key: str

        :param type:
            The value to assign to the type property of this CreateKnowledgeBaseDetails.
            Allowed values for this property are: "NATIVE"
        :type type: str

        :param schema_key:
            The value to assign to the schema_key property of this CreateKnowledgeBaseDetails.
        :type schema_key: str

        :param workspace_key:
            The value to assign to the workspace_key property of this CreateKnowledgeBaseDetails.
        :type workspace_key: str

        :param cluster_key:
            The value to assign to the cluster_key property of this CreateKnowledgeBaseDetails.
        :type cluster_key: str

        :param modality:
            The value to assign to the modality property of this CreateKnowledgeBaseDetails.
            Allowed values for this property are: "TEXT"
        :type modality: str

        :param embedding_model_source_type:
            The value to assign to the embedding_model_source_type property of this CreateKnowledgeBaseDetails.
            Allowed values for this property are: "ADW_23_AI", "ADW_26_AI", "GEN_AI"
        :type embedding_model_source_type: str

        :param embedding_model_name:
            The value to assign to the embedding_model_name property of this CreateKnowledgeBaseDetails.
        :type embedding_model_name: str

        :param chunk_size:
            The value to assign to the chunk_size property of this CreateKnowledgeBaseDetails.
        :type chunk_size: int

        :param chunk_overlap:
            The value to assign to the chunk_overlap property of this CreateKnowledgeBaseDetails.
        :type chunk_overlap: int

        :param source_file_pattern:
            The value to assign to the source_file_pattern property of this CreateKnowledgeBaseDetails.
        :type source_file_pattern: str

        :param index_details:
            The value to assign to the index_details property of this CreateKnowledgeBaseDetails.
        :type index_details: oci.aidataplatform_dp.models.KnowledgeBaseVectorIndexDetails

        """
        self.swagger_types = {
            'display_name': 'str',
            'description': 'str',
            'catalog_key': 'str',
            'type': 'str',
            'schema_key': 'str',
            'workspace_key': 'str',
            'cluster_key': 'str',
            'modality': 'str',
            'embedding_model_source_type': 'str',
            'embedding_model_name': 'str',
            'chunk_size': 'int',
            'chunk_overlap': 'int',
            'source_file_pattern': 'str',
            'index_details': 'KnowledgeBaseVectorIndexDetails'
        }

        self.attribute_map = {
            'display_name': 'displayName',
            'description': 'description',
            'catalog_key': 'catalogKey',
            'type': 'type',
            'schema_key': 'schemaKey',
            'workspace_key': 'workspaceKey',
            'cluster_key': 'clusterKey',
            'modality': 'modality',
            'embedding_model_source_type': 'embeddingModelSourceType',
            'embedding_model_name': 'embeddingModelName',
            'chunk_size': 'chunkSize',
            'chunk_overlap': 'chunkOverlap',
            'source_file_pattern': 'sourceFilePattern',
            'index_details': 'indexDetails'
        }

        self._display_name = None
        self._description = None
        self._catalog_key = None
        self._type = None
        self._schema_key = None
        self._workspace_key = None
        self._cluster_key = None
        self._modality = None
        self._embedding_model_source_type = None
        self._embedding_model_name = None
        self._chunk_size = None
        self._chunk_overlap = None
        self._source_file_pattern = None
        self._index_details = None

    @property
    def display_name(self):
        """
        **[Required]** Gets the display_name of this CreateKnowledgeBaseDetails.
        Name of KnowledgeBase


        :return: The display_name of this CreateKnowledgeBaseDetails.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this CreateKnowledgeBaseDetails.
        Name of KnowledgeBase


        :param display_name: The display_name of this CreateKnowledgeBaseDetails.
        :type: str
        """
        self._display_name = display_name

    @property
    def description(self):
        """
        Gets the description of this CreateKnowledgeBaseDetails.
        The description of KnowledgeBase.


        :return: The description of this CreateKnowledgeBaseDetails.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this CreateKnowledgeBaseDetails.
        The description of KnowledgeBase.


        :param description: The description of this CreateKnowledgeBaseDetails.
        :type: str
        """
        self._description = description

    @property
    def catalog_key(self):
        """
        **[Required]** Gets the catalog_key of this CreateKnowledgeBaseDetails.
        The key of the catalog containing the KnowledgeBase.


        :return: The catalog_key of this CreateKnowledgeBaseDetails.
        :rtype: str
        """
        return self._catalog_key

    @catalog_key.setter
    def catalog_key(self, catalog_key):
        """
        Sets the catalog_key of this CreateKnowledgeBaseDetails.
        The key of the catalog containing the KnowledgeBase.


        :param catalog_key: The catalog_key of this CreateKnowledgeBaseDetails.
        :type: str
        """
        self._catalog_key = catalog_key

    @property
    def type(self):
        """
        **[Required]** Gets the type of this CreateKnowledgeBaseDetails.
        type of KnowledgeBase

        Allowed values for this property are: "NATIVE"


        :return: The type of this CreateKnowledgeBaseDetails.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this CreateKnowledgeBaseDetails.
        type of KnowledgeBase


        :param type: The type of this CreateKnowledgeBaseDetails.
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
    def schema_key(self):
        """
        **[Required]** Gets the schema_key of this CreateKnowledgeBaseDetails.
        The key of the schema containing the Knowledgebase.


        :return: The schema_key of this CreateKnowledgeBaseDetails.
        :rtype: str
        """
        return self._schema_key

    @schema_key.setter
    def schema_key(self, schema_key):
        """
        Sets the schema_key of this CreateKnowledgeBaseDetails.
        The key of the schema containing the Knowledgebase.


        :param schema_key: The schema_key of this CreateKnowledgeBaseDetails.
        :type: str
        """
        self._schema_key = schema_key

    @property
    def workspace_key(self):
        """
        **[Required]** Gets the workspace_key of this CreateKnowledgeBaseDetails.
        The id of the workspace associated with the KnowledgeBase.


        :return: The workspace_key of this CreateKnowledgeBaseDetails.
        :rtype: str
        """
        return self._workspace_key

    @workspace_key.setter
    def workspace_key(self, workspace_key):
        """
        Sets the workspace_key of this CreateKnowledgeBaseDetails.
        The id of the workspace associated with the KnowledgeBase.


        :param workspace_key: The workspace_key of this CreateKnowledgeBaseDetails.
        :type: str
        """
        self._workspace_key = workspace_key

    @property
    def cluster_key(self):
        """
        **[Required]** Gets the cluster_key of this CreateKnowledgeBaseDetails.
        The id of the cluster associated with the KnowledgeBase.


        :return: The cluster_key of this CreateKnowledgeBaseDetails.
        :rtype: str
        """
        return self._cluster_key

    @cluster_key.setter
    def cluster_key(self, cluster_key):
        """
        Sets the cluster_key of this CreateKnowledgeBaseDetails.
        The id of the cluster associated with the KnowledgeBase.


        :param cluster_key: The cluster_key of this CreateKnowledgeBaseDetails.
        :type: str
        """
        self._cluster_key = cluster_key

    @property
    def modality(self):
        """
        Gets the modality of this CreateKnowledgeBaseDetails.
        Modality of the data in this KnowledgeBase

        Allowed values for this property are: "TEXT"


        :return: The modality of this CreateKnowledgeBaseDetails.
        :rtype: str
        """
        return self._modality

    @modality.setter
    def modality(self, modality):
        """
        Sets the modality of this CreateKnowledgeBaseDetails.
        Modality of the data in this KnowledgeBase


        :param modality: The modality of this CreateKnowledgeBaseDetails.
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
        Gets the embedding_model_source_type of this CreateKnowledgeBaseDetails.
        Information about where embedding model is located

        Allowed values for this property are: "ADW_23_AI", "ADW_26_AI", "GEN_AI"


        :return: The embedding_model_source_type of this CreateKnowledgeBaseDetails.
        :rtype: str
        """
        return self._embedding_model_source_type

    @embedding_model_source_type.setter
    def embedding_model_source_type(self, embedding_model_source_type):
        """
        Sets the embedding_model_source_type of this CreateKnowledgeBaseDetails.
        Information about where embedding model is located


        :param embedding_model_source_type: The embedding_model_source_type of this CreateKnowledgeBaseDetails.
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
        Gets the embedding_model_name of this CreateKnowledgeBaseDetails.
        Name of the embedding model


        :return: The embedding_model_name of this CreateKnowledgeBaseDetails.
        :rtype: str
        """
        return self._embedding_model_name

    @embedding_model_name.setter
    def embedding_model_name(self, embedding_model_name):
        """
        Sets the embedding_model_name of this CreateKnowledgeBaseDetails.
        Name of the embedding model


        :param embedding_model_name: The embedding_model_name of this CreateKnowledgeBaseDetails.
        :type: str
        """
        self._embedding_model_name = embedding_model_name

    @property
    def chunk_size(self):
        """
        Gets the chunk_size of this CreateKnowledgeBaseDetails.
        Chunk size at KnowledgeBase level which can be overridden by source level settings


        :return: The chunk_size of this CreateKnowledgeBaseDetails.
        :rtype: int
        """
        return self._chunk_size

    @chunk_size.setter
    def chunk_size(self, chunk_size):
        """
        Sets the chunk_size of this CreateKnowledgeBaseDetails.
        Chunk size at KnowledgeBase level which can be overridden by source level settings


        :param chunk_size: The chunk_size of this CreateKnowledgeBaseDetails.
        :type: int
        """
        self._chunk_size = chunk_size

    @property
    def chunk_overlap(self):
        """
        Gets the chunk_overlap of this CreateKnowledgeBaseDetails.
        Chunk Overlap at KnowledgeBase level which can be overridden by source level settings


        :return: The chunk_overlap of this CreateKnowledgeBaseDetails.
        :rtype: int
        """
        return self._chunk_overlap

    @chunk_overlap.setter
    def chunk_overlap(self, chunk_overlap):
        """
        Sets the chunk_overlap of this CreateKnowledgeBaseDetails.
        Chunk Overlap at KnowledgeBase level which can be overridden by source level settings


        :param chunk_overlap: The chunk_overlap of this CreateKnowledgeBaseDetails.
        :type: int
        """
        self._chunk_overlap = chunk_overlap

    @property
    def source_file_pattern(self):
        """
        Gets the source_file_pattern of this CreateKnowledgeBaseDetails.
        Applicable for Native KnowledgeBase where source type is KnowledgeBase


        :return: The source_file_pattern of this CreateKnowledgeBaseDetails.
        :rtype: str
        """
        return self._source_file_pattern

    @source_file_pattern.setter
    def source_file_pattern(self, source_file_pattern):
        """
        Sets the source_file_pattern of this CreateKnowledgeBaseDetails.
        Applicable for Native KnowledgeBase where source type is KnowledgeBase


        :param source_file_pattern: The source_file_pattern of this CreateKnowledgeBaseDetails.
        :type: str
        """
        self._source_file_pattern = source_file_pattern

    @property
    def index_details(self):
        """
        Gets the index_details of this CreateKnowledgeBaseDetails.

        :return: The index_details of this CreateKnowledgeBaseDetails.
        :rtype: oci.aidataplatform_dp.models.KnowledgeBaseVectorIndexDetails
        """
        return self._index_details

    @index_details.setter
    def index_details(self, index_details):
        """
        Sets the index_details of this CreateKnowledgeBaseDetails.

        :param index_details: The index_details of this CreateKnowledgeBaseDetails.
        :type: oci.aidataplatform_dp.models.KnowledgeBaseVectorIndexDetails
        """
        self._index_details = index_details

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
