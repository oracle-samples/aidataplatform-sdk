# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class KnowledgeBaseSourceMetadataDetails(object):
    """
    The information about a source to be added to a KnowledgeBase
    """

    #: A constant which can be used with the type property of a KnowledgeBaseSourceMetadataDetails.
    #: This constant has a value of "VOLUME"
    TYPE_VOLUME = "VOLUME"

    #: A constant which can be used with the type property of a KnowledgeBaseSourceMetadataDetails.
    #: This constant has a value of "TABLE"
    TYPE_TABLE = "TABLE"

    def __init__(self, **kwargs):
        """
        Initializes a new KnowledgeBaseSourceMetadataDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param key:
            The value to assign to the key property of this KnowledgeBaseSourceMetadataDetails.
        :type key: str

        :param name:
            The value to assign to the name property of this KnowledgeBaseSourceMetadataDetails.
        :type name: str

        :param description:
            The value to assign to the description property of this KnowledgeBaseSourceMetadataDetails.
        :type description: str

        :param type:
            The value to assign to the type property of this KnowledgeBaseSourceMetadataDetails.
            Allowed values for this property are: "VOLUME", "TABLE"
        :type type: str

        :param location:
            The value to assign to the location property of this KnowledgeBaseSourceMetadataDetails.
        :type location: str

        :param workspace_key:
            The value to assign to the workspace_key property of this KnowledgeBaseSourceMetadataDetails.
        :type workspace_key: str

        :param cluster_key:
            The value to assign to the cluster_key property of this KnowledgeBaseSourceMetadataDetails.
        :type cluster_key: str

        :param chunk_size:
            The value to assign to the chunk_size property of this KnowledgeBaseSourceMetadataDetails.
        :type chunk_size: int

        :param chunk_overlap:
            The value to assign to the chunk_overlap property of this KnowledgeBaseSourceMetadataDetails.
        :type chunk_overlap: int

        :param source_file_pattern:
            The value to assign to the source_file_pattern property of this KnowledgeBaseSourceMetadataDetails.
        :type source_file_pattern: str

        :param time_created:
            The value to assign to the time_created property of this KnowledgeBaseSourceMetadataDetails.
        :type time_created: datetime

        :param created_by:
            The value to assign to the created_by property of this KnowledgeBaseSourceMetadataDetails.
        :type created_by: str

        """
        self.swagger_types = {
            'key': 'str',
            'name': 'str',
            'description': 'str',
            'type': 'str',
            'location': 'str',
            'workspace_key': 'str',
            'cluster_key': 'str',
            'chunk_size': 'int',
            'chunk_overlap': 'int',
            'source_file_pattern': 'str',
            'time_created': 'datetime',
            'created_by': 'str'
        }

        self.attribute_map = {
            'key': 'key',
            'name': 'name',
            'description': 'description',
            'type': 'type',
            'location': 'location',
            'workspace_key': 'workspaceKey',
            'cluster_key': 'clusterKey',
            'chunk_size': 'chunkSize',
            'chunk_overlap': 'chunkOverlap',
            'source_file_pattern': 'sourceFilePattern',
            'time_created': 'timeCreated',
            'created_by': 'createdBy'
        }

        self._key = None
        self._name = None
        self._description = None
        self._type = None
        self._location = None
        self._workspace_key = None
        self._cluster_key = None
        self._chunk_size = None
        self._chunk_overlap = None
        self._source_file_pattern = None
        self._time_created = None
        self._created_by = None

    @property
    def key(self):
        """
        **[Required]** Gets the key of this KnowledgeBaseSourceMetadataDetails.
        key for the source


        :return: The key of this KnowledgeBaseSourceMetadataDetails.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this KnowledgeBaseSourceMetadataDetails.
        key for the source


        :param key: The key of this KnowledgeBaseSourceMetadataDetails.
        :type: str
        """
        self._key = key

    @property
    def name(self):
        """
        **[Required]** Gets the name of this KnowledgeBaseSourceMetadataDetails.
        name for the source


        :return: The name of this KnowledgeBaseSourceMetadataDetails.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this KnowledgeBaseSourceMetadataDetails.
        name for the source


        :param name: The name of this KnowledgeBaseSourceMetadataDetails.
        :type: str
        """
        self._name = name

    @property
    def description(self):
        """
        Gets the description of this KnowledgeBaseSourceMetadataDetails.
        New description of KnowledgeBase


        :return: The description of this KnowledgeBaseSourceMetadataDetails.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this KnowledgeBaseSourceMetadataDetails.
        New description of KnowledgeBase


        :param description: The description of this KnowledgeBaseSourceMetadataDetails.
        :type: str
        """
        self._description = description

    @property
    def type(self):
        """
        **[Required]** Gets the type of this KnowledgeBaseSourceMetadataDetails.
        The type of source

        Allowed values for this property are: "VOLUME", "TABLE"


        :return: The type of this KnowledgeBaseSourceMetadataDetails.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this KnowledgeBaseSourceMetadataDetails.
        The type of source


        :param type: The type of this KnowledgeBaseSourceMetadataDetails.
        :type: str
        """
        allowed_values = ["VOLUME", "TABLE"]
        if not value_allowed_none_or_none_sentinel(type, allowed_values):
            raise ValueError(
                "Invalid value for `type`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._type = type

    @property
    def location(self):
        """
        **[Required]** Gets the location of this KnowledgeBaseSourceMetadataDetails.
        location on volume or name of the table


        :return: The location of this KnowledgeBaseSourceMetadataDetails.
        :rtype: str
        """
        return self._location

    @location.setter
    def location(self, location):
        """
        Sets the location of this KnowledgeBaseSourceMetadataDetails.
        location on volume or name of the table


        :param location: The location of this KnowledgeBaseSourceMetadataDetails.
        :type: str
        """
        self._location = location

    @property
    def workspace_key(self):
        """
        Gets the workspace_key of this KnowledgeBaseSourceMetadataDetails.
        The id of the workspace associated with the source.


        :return: The workspace_key of this KnowledgeBaseSourceMetadataDetails.
        :rtype: str
        """
        return self._workspace_key

    @workspace_key.setter
    def workspace_key(self, workspace_key):
        """
        Sets the workspace_key of this KnowledgeBaseSourceMetadataDetails.
        The id of the workspace associated with the source.


        :param workspace_key: The workspace_key of this KnowledgeBaseSourceMetadataDetails.
        :type: str
        """
        self._workspace_key = workspace_key

    @property
    def cluster_key(self):
        """
        Gets the cluster_key of this KnowledgeBaseSourceMetadataDetails.
        The id of the cluster associated with the source.


        :return: The cluster_key of this KnowledgeBaseSourceMetadataDetails.
        :rtype: str
        """
        return self._cluster_key

    @cluster_key.setter
    def cluster_key(self, cluster_key):
        """
        Sets the cluster_key of this KnowledgeBaseSourceMetadataDetails.
        The id of the cluster associated with the source.


        :param cluster_key: The cluster_key of this KnowledgeBaseSourceMetadataDetails.
        :type: str
        """
        self._cluster_key = cluster_key

    @property
    def chunk_size(self):
        """
        Gets the chunk_size of this KnowledgeBaseSourceMetadataDetails.
        Chunk size at source level settings


        :return: The chunk_size of this KnowledgeBaseSourceMetadataDetails.
        :rtype: int
        """
        return self._chunk_size

    @chunk_size.setter
    def chunk_size(self, chunk_size):
        """
        Sets the chunk_size of this KnowledgeBaseSourceMetadataDetails.
        Chunk size at source level settings


        :param chunk_size: The chunk_size of this KnowledgeBaseSourceMetadataDetails.
        :type: int
        """
        self._chunk_size = chunk_size

    @property
    def chunk_overlap(self):
        """
        Gets the chunk_overlap of this KnowledgeBaseSourceMetadataDetails.
        Chunk Overlap at source level settings


        :return: The chunk_overlap of this KnowledgeBaseSourceMetadataDetails.
        :rtype: int
        """
        return self._chunk_overlap

    @chunk_overlap.setter
    def chunk_overlap(self, chunk_overlap):
        """
        Sets the chunk_overlap of this KnowledgeBaseSourceMetadataDetails.
        Chunk Overlap at source level settings


        :param chunk_overlap: The chunk_overlap of this KnowledgeBaseSourceMetadataDetails.
        :type: int
        """
        self._chunk_overlap = chunk_overlap

    @property
    def source_file_pattern(self):
        """
        Gets the source_file_pattern of this KnowledgeBaseSourceMetadataDetails.
        Applicable for Native KnowledgeBase where source type is KnowledgeBase


        :return: The source_file_pattern of this KnowledgeBaseSourceMetadataDetails.
        :rtype: str
        """
        return self._source_file_pattern

    @source_file_pattern.setter
    def source_file_pattern(self, source_file_pattern):
        """
        Sets the source_file_pattern of this KnowledgeBaseSourceMetadataDetails.
        Applicable for Native KnowledgeBase where source type is KnowledgeBase


        :param source_file_pattern: The source_file_pattern of this KnowledgeBaseSourceMetadataDetails.
        :type: str
        """
        self._source_file_pattern = source_file_pattern

    @property
    def time_created(self):
        """
        Gets the time_created of this KnowledgeBaseSourceMetadataDetails.
        The time at which KnowledgeBase was created. An RFC3339 formatted datetime string


        :return: The time_created of this KnowledgeBaseSourceMetadataDetails.
        :rtype: datetime
        """
        return self._time_created

    @time_created.setter
    def time_created(self, time_created):
        """
        Sets the time_created of this KnowledgeBaseSourceMetadataDetails.
        The time at which KnowledgeBase was created. An RFC3339 formatted datetime string


        :param time_created: The time_created of this KnowledgeBaseSourceMetadataDetails.
        :type: datetime
        """
        self._time_created = time_created

    @property
    def created_by(self):
        """
        Gets the created_by of this KnowledgeBaseSourceMetadataDetails.
        Identifier for KnowledgeBase creator


        :return: The created_by of this KnowledgeBaseSourceMetadataDetails.
        :rtype: str
        """
        return self._created_by

    @created_by.setter
    def created_by(self, created_by):
        """
        Sets the created_by of this KnowledgeBaseSourceMetadataDetails.
        Identifier for KnowledgeBase creator


        :param created_by: The created_by of this KnowledgeBaseSourceMetadataDetails.
        :type: str
        """
        self._created_by = created_by

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
