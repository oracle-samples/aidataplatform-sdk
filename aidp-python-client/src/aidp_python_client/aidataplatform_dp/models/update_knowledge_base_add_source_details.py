# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class UpdateKnowledgeBaseAddSourceDetails(object):
    """
    The information about a source to be added to a KnowledgeBase
    """

    #: A constant which can be used with the type property of a UpdateKnowledgeBaseAddSourceDetails.
    #: This constant has a value of "VOLUME"
    TYPE_VOLUME = "VOLUME"

    #: A constant which can be used with the type property of a UpdateKnowledgeBaseAddSourceDetails.
    #: This constant has a value of "TABLE"
    TYPE_TABLE = "TABLE"

    def __init__(self, **kwargs):
        """
        Initializes a new UpdateKnowledgeBaseAddSourceDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param name:
            The value to assign to the name property of this UpdateKnowledgeBaseAddSourceDetails.
        :type name: str

        :param description:
            The value to assign to the description property of this UpdateKnowledgeBaseAddSourceDetails.
        :type description: str

        :param type:
            The value to assign to the type property of this UpdateKnowledgeBaseAddSourceDetails.
            Allowed values for this property are: "VOLUME", "TABLE"
        :type type: str

        :param should_run_ingestion_job_inline:
            The value to assign to the should_run_ingestion_job_inline property of this UpdateKnowledgeBaseAddSourceDetails.
        :type should_run_ingestion_job_inline: bool

        :param workspace_key:
            The value to assign to the workspace_key property of this UpdateKnowledgeBaseAddSourceDetails.
        :type workspace_key: str

        :param cluster_key:
            The value to assign to the cluster_key property of this UpdateKnowledgeBaseAddSourceDetails.
        :type cluster_key: str

        :param location:
            The value to assign to the location property of this UpdateKnowledgeBaseAddSourceDetails.
        :type location: str

        :param chunk_size:
            The value to assign to the chunk_size property of this UpdateKnowledgeBaseAddSourceDetails.
        :type chunk_size: int

        :param chunk_overlap:
            The value to assign to the chunk_overlap property of this UpdateKnowledgeBaseAddSourceDetails.
        :type chunk_overlap: int

        :param source_file_pattern:
            The value to assign to the source_file_pattern property of this UpdateKnowledgeBaseAddSourceDetails.
        :type source_file_pattern: str

        """
        self.swagger_types = {
            'name': 'str',
            'description': 'str',
            'type': 'str',
            'should_run_ingestion_job_inline': 'bool',
            'workspace_key': 'str',
            'cluster_key': 'str',
            'location': 'str',
            'chunk_size': 'int',
            'chunk_overlap': 'int',
            'source_file_pattern': 'str'
        }

        self.attribute_map = {
            'name': 'name',
            'description': 'description',
            'type': 'type',
            'should_run_ingestion_job_inline': 'shouldRunIngestionJobInline',
            'workspace_key': 'workspaceKey',
            'cluster_key': 'clusterKey',
            'location': 'location',
            'chunk_size': 'chunkSize',
            'chunk_overlap': 'chunkOverlap',
            'source_file_pattern': 'sourceFilePattern'
        }

        self._name = None
        self._description = None
        self._type = None
        self._should_run_ingestion_job_inline = None
        self._workspace_key = None
        self._cluster_key = None
        self._location = None
        self._chunk_size = None
        self._chunk_overlap = None
        self._source_file_pattern = None

    @property
    def name(self):
        """
        **[Required]** Gets the name of this UpdateKnowledgeBaseAddSourceDetails.
        name for source


        :return: The name of this UpdateKnowledgeBaseAddSourceDetails.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this UpdateKnowledgeBaseAddSourceDetails.
        name for source


        :param name: The name of this UpdateKnowledgeBaseAddSourceDetails.
        :type: str
        """
        self._name = name

    @property
    def description(self):
        """
        Gets the description of this UpdateKnowledgeBaseAddSourceDetails.
        New description of KnowledgeBase


        :return: The description of this UpdateKnowledgeBaseAddSourceDetails.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this UpdateKnowledgeBaseAddSourceDetails.
        New description of KnowledgeBase


        :param description: The description of this UpdateKnowledgeBaseAddSourceDetails.
        :type: str
        """
        self._description = description

    @property
    def type(self):
        """
        **[Required]** Gets the type of this UpdateKnowledgeBaseAddSourceDetails.
        The type of source

        Allowed values for this property are: "VOLUME", "TABLE"


        :return: The type of this UpdateKnowledgeBaseAddSourceDetails.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this UpdateKnowledgeBaseAddSourceDetails.
        The type of source


        :param type: The type of this UpdateKnowledgeBaseAddSourceDetails.
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
    def should_run_ingestion_job_inline(self):
        """
        Gets the should_run_ingestion_job_inline of this UpdateKnowledgeBaseAddSourceDetails.
        Optional boolean flag to indicate if ingestion job should run inline.


        :return: The should_run_ingestion_job_inline of this UpdateKnowledgeBaseAddSourceDetails.
        :rtype: bool
        """
        return self._should_run_ingestion_job_inline

    @should_run_ingestion_job_inline.setter
    def should_run_ingestion_job_inline(self, should_run_ingestion_job_inline):
        """
        Sets the should_run_ingestion_job_inline of this UpdateKnowledgeBaseAddSourceDetails.
        Optional boolean flag to indicate if ingestion job should run inline.


        :param should_run_ingestion_job_inline: The should_run_ingestion_job_inline of this UpdateKnowledgeBaseAddSourceDetails.
        :type: bool
        """
        self._should_run_ingestion_job_inline = should_run_ingestion_job_inline

    @property
    def workspace_key(self):
        """
        Gets the workspace_key of this UpdateKnowledgeBaseAddSourceDetails.
        The id of the workspace associated with the source.


        :return: The workspace_key of this UpdateKnowledgeBaseAddSourceDetails.
        :rtype: str
        """
        return self._workspace_key

    @workspace_key.setter
    def workspace_key(self, workspace_key):
        """
        Sets the workspace_key of this UpdateKnowledgeBaseAddSourceDetails.
        The id of the workspace associated with the source.


        :param workspace_key: The workspace_key of this UpdateKnowledgeBaseAddSourceDetails.
        :type: str
        """
        self._workspace_key = workspace_key

    @property
    def cluster_key(self):
        """
        Gets the cluster_key of this UpdateKnowledgeBaseAddSourceDetails.
        The id of the cluster associated with the source.


        :return: The cluster_key of this UpdateKnowledgeBaseAddSourceDetails.
        :rtype: str
        """
        return self._cluster_key

    @cluster_key.setter
    def cluster_key(self, cluster_key):
        """
        Sets the cluster_key of this UpdateKnowledgeBaseAddSourceDetails.
        The id of the cluster associated with the source.


        :param cluster_key: The cluster_key of this UpdateKnowledgeBaseAddSourceDetails.
        :type: str
        """
        self._cluster_key = cluster_key

    @property
    def location(self):
        """
        **[Required]** Gets the location of this UpdateKnowledgeBaseAddSourceDetails.
        location on volume or name of the table


        :return: The location of this UpdateKnowledgeBaseAddSourceDetails.
        :rtype: str
        """
        return self._location

    @location.setter
    def location(self, location):
        """
        Sets the location of this UpdateKnowledgeBaseAddSourceDetails.
        location on volume or name of the table


        :param location: The location of this UpdateKnowledgeBaseAddSourceDetails.
        :type: str
        """
        self._location = location

    @property
    def chunk_size(self):
        """
        Gets the chunk_size of this UpdateKnowledgeBaseAddSourceDetails.
        Chunk size at KnowledgeBase level which can be overridden by source level settings


        :return: The chunk_size of this UpdateKnowledgeBaseAddSourceDetails.
        :rtype: int
        """
        return self._chunk_size

    @chunk_size.setter
    def chunk_size(self, chunk_size):
        """
        Sets the chunk_size of this UpdateKnowledgeBaseAddSourceDetails.
        Chunk size at KnowledgeBase level which can be overridden by source level settings


        :param chunk_size: The chunk_size of this UpdateKnowledgeBaseAddSourceDetails.
        :type: int
        """
        self._chunk_size = chunk_size

    @property
    def chunk_overlap(self):
        """
        Gets the chunk_overlap of this UpdateKnowledgeBaseAddSourceDetails.
        Chunk Overlap at KnowledgeBase level which can be overridden by source level settings


        :return: The chunk_overlap of this UpdateKnowledgeBaseAddSourceDetails.
        :rtype: int
        """
        return self._chunk_overlap

    @chunk_overlap.setter
    def chunk_overlap(self, chunk_overlap):
        """
        Sets the chunk_overlap of this UpdateKnowledgeBaseAddSourceDetails.
        Chunk Overlap at KnowledgeBase level which can be overridden by source level settings


        :param chunk_overlap: The chunk_overlap of this UpdateKnowledgeBaseAddSourceDetails.
        :type: int
        """
        self._chunk_overlap = chunk_overlap

    @property
    def source_file_pattern(self):
        """
        Gets the source_file_pattern of this UpdateKnowledgeBaseAddSourceDetails.
        Applicable for Native KnowledgeBase where source type is KnowledgeBase


        :return: The source_file_pattern of this UpdateKnowledgeBaseAddSourceDetails.
        :rtype: str
        """
        return self._source_file_pattern

    @source_file_pattern.setter
    def source_file_pattern(self, source_file_pattern):
        """
        Sets the source_file_pattern of this UpdateKnowledgeBaseAddSourceDetails.
        Applicable for Native KnowledgeBase where source type is KnowledgeBase


        :param source_file_pattern: The source_file_pattern of this UpdateKnowledgeBaseAddSourceDetails.
        :type: str
        """
        self._source_file_pattern = source_file_pattern

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
