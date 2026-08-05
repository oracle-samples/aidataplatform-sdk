# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class FindOntologyGraphPathsDetails(object):
    """
    FindOntologyGraphPathsDetails model.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new FindOntologyGraphPathsDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param project_id:
            The value to assign to the project_id property of this FindOntologyGraphPathsDetails.
        :type project_id: str

        :param source_node_id:
            The value to assign to the source_node_id property of this FindOntologyGraphPathsDetails.
        :type source_node_id: str

        :param target_node_id:
            The value to assign to the target_node_id property of this FindOntologyGraphPathsDetails.
        :type target_node_id: str

        :param max_depth:
            The value to assign to the max_depth property of this FindOntologyGraphPathsDetails.
        :type max_depth: int

        :param relationship_types:
            The value to assign to the relationship_types property of this FindOntologyGraphPathsDetails.
        :type relationship_types: list[str]

        :param limit:
            The value to assign to the limit property of this FindOntologyGraphPathsDetails.
        :type limit: int

        """
        self.swagger_types = {
            'project_id': 'str',
            'source_node_id': 'str',
            'target_node_id': 'str',
            'max_depth': 'int',
            'relationship_types': 'list[str]',
            'limit': 'int'
        }

        self.attribute_map = {
            'project_id': 'projectId',
            'source_node_id': 'sourceNodeId',
            'target_node_id': 'targetNodeId',
            'max_depth': 'maxDepth',
            'relationship_types': 'relationshipTypes',
            'limit': 'limit'
        }

        self._project_id = None
        self._source_node_id = None
        self._target_node_id = None
        self._max_depth = None
        self._relationship_types = None
        self._limit = None

    @property
    def project_id(self):
        """
        **[Required]** Gets the project_id of this FindOntologyGraphPathsDetails.

        :return: The project_id of this FindOntologyGraphPathsDetails.
        :rtype: str
        """
        return self._project_id

    @project_id.setter
    def project_id(self, project_id):
        """
        Sets the project_id of this FindOntologyGraphPathsDetails.

        :param project_id: The project_id of this FindOntologyGraphPathsDetails.
        :type: str
        """
        self._project_id = project_id

    @property
    def source_node_id(self):
        """
        **[Required]** Gets the source_node_id of this FindOntologyGraphPathsDetails.

        :return: The source_node_id of this FindOntologyGraphPathsDetails.
        :rtype: str
        """
        return self._source_node_id

    @source_node_id.setter
    def source_node_id(self, source_node_id):
        """
        Sets the source_node_id of this FindOntologyGraphPathsDetails.

        :param source_node_id: The source_node_id of this FindOntologyGraphPathsDetails.
        :type: str
        """
        self._source_node_id = source_node_id

    @property
    def target_node_id(self):
        """
        **[Required]** Gets the target_node_id of this FindOntologyGraphPathsDetails.

        :return: The target_node_id of this FindOntologyGraphPathsDetails.
        :rtype: str
        """
        return self._target_node_id

    @target_node_id.setter
    def target_node_id(self, target_node_id):
        """
        Sets the target_node_id of this FindOntologyGraphPathsDetails.

        :param target_node_id: The target_node_id of this FindOntologyGraphPathsDetails.
        :type: str
        """
        self._target_node_id = target_node_id

    @property
    def max_depth(self):
        """
        Gets the max_depth of this FindOntologyGraphPathsDetails.

        :return: The max_depth of this FindOntologyGraphPathsDetails.
        :rtype: int
        """
        return self._max_depth

    @max_depth.setter
    def max_depth(self, max_depth):
        """
        Sets the max_depth of this FindOntologyGraphPathsDetails.

        :param max_depth: The max_depth of this FindOntologyGraphPathsDetails.
        :type: int
        """
        self._max_depth = max_depth

    @property
    def relationship_types(self):
        """
        Gets the relationship_types of this FindOntologyGraphPathsDetails.

        :return: The relationship_types of this FindOntologyGraphPathsDetails.
        :rtype: list[str]
        """
        return self._relationship_types

    @relationship_types.setter
    def relationship_types(self, relationship_types):
        """
        Sets the relationship_types of this FindOntologyGraphPathsDetails.

        :param relationship_types: The relationship_types of this FindOntologyGraphPathsDetails.
        :type: list[str]
        """
        self._relationship_types = relationship_types

    @property
    def limit(self):
        """
        Gets the limit of this FindOntologyGraphPathsDetails.

        :return: The limit of this FindOntologyGraphPathsDetails.
        :rtype: int
        """
        return self._limit

    @limit.setter
    def limit(self, limit):
        """
        Sets the limit of this FindOntologyGraphPathsDetails.

        :param limit: The limit of this FindOntologyGraphPathsDetails.
        :type: int
        """
        self._limit = limit

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
