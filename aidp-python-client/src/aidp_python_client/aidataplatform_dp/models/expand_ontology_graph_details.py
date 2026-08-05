# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ExpandOntologyGraphDetails(object):
    """
    ExpandOntologyGraphDetails model.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ExpandOntologyGraphDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param project_id:
            The value to assign to the project_id property of this ExpandOntologyGraphDetails.
        :type project_id: str

        :param start_node_id:
            The value to assign to the start_node_id property of this ExpandOntologyGraphDetails.
        :type start_node_id: str

        :param direction:
            The value to assign to the direction property of this ExpandOntologyGraphDetails.
        :type direction: str

        :param depth:
            The value to assign to the depth property of this ExpandOntologyGraphDetails.
        :type depth: int

        :param relationship_types:
            The value to assign to the relationship_types property of this ExpandOntologyGraphDetails.
        :type relationship_types: list[str]

        :param limit:
            The value to assign to the limit property of this ExpandOntologyGraphDetails.
        :type limit: int

        """
        self.swagger_types = {
            'project_id': 'str',
            'start_node_id': 'str',
            'direction': 'str',
            'depth': 'int',
            'relationship_types': 'list[str]',
            'limit': 'int'
        }

        self.attribute_map = {
            'project_id': 'projectId',
            'start_node_id': 'startNodeId',
            'direction': 'direction',
            'depth': 'depth',
            'relationship_types': 'relationshipTypes',
            'limit': 'limit'
        }

        self._project_id = None
        self._start_node_id = None
        self._direction = None
        self._depth = None
        self._relationship_types = None
        self._limit = None

    @property
    def project_id(self):
        """
        **[Required]** Gets the project_id of this ExpandOntologyGraphDetails.

        :return: The project_id of this ExpandOntologyGraphDetails.
        :rtype: str
        """
        return self._project_id

    @project_id.setter
    def project_id(self, project_id):
        """
        Sets the project_id of this ExpandOntologyGraphDetails.

        :param project_id: The project_id of this ExpandOntologyGraphDetails.
        :type: str
        """
        self._project_id = project_id

    @property
    def start_node_id(self):
        """
        **[Required]** Gets the start_node_id of this ExpandOntologyGraphDetails.

        :return: The start_node_id of this ExpandOntologyGraphDetails.
        :rtype: str
        """
        return self._start_node_id

    @start_node_id.setter
    def start_node_id(self, start_node_id):
        """
        Sets the start_node_id of this ExpandOntologyGraphDetails.

        :param start_node_id: The start_node_id of this ExpandOntologyGraphDetails.
        :type: str
        """
        self._start_node_id = start_node_id

    @property
    def direction(self):
        """
        Gets the direction of this ExpandOntologyGraphDetails.
        OUT, IN, or BOTH.


        :return: The direction of this ExpandOntologyGraphDetails.
        :rtype: str
        """
        return self._direction

    @direction.setter
    def direction(self, direction):
        """
        Sets the direction of this ExpandOntologyGraphDetails.
        OUT, IN, or BOTH.


        :param direction: The direction of this ExpandOntologyGraphDetails.
        :type: str
        """
        self._direction = direction

    @property
    def depth(self):
        """
        Gets the depth of this ExpandOntologyGraphDetails.

        :return: The depth of this ExpandOntologyGraphDetails.
        :rtype: int
        """
        return self._depth

    @depth.setter
    def depth(self, depth):
        """
        Sets the depth of this ExpandOntologyGraphDetails.

        :param depth: The depth of this ExpandOntologyGraphDetails.
        :type: int
        """
        self._depth = depth

    @property
    def relationship_types(self):
        """
        Gets the relationship_types of this ExpandOntologyGraphDetails.

        :return: The relationship_types of this ExpandOntologyGraphDetails.
        :rtype: list[str]
        """
        return self._relationship_types

    @relationship_types.setter
    def relationship_types(self, relationship_types):
        """
        Sets the relationship_types of this ExpandOntologyGraphDetails.

        :param relationship_types: The relationship_types of this ExpandOntologyGraphDetails.
        :type: list[str]
        """
        self._relationship_types = relationship_types

    @property
    def limit(self):
        """
        Gets the limit of this ExpandOntologyGraphDetails.

        :return: The limit of this ExpandOntologyGraphDetails.
        :rtype: int
        """
        return self._limit

    @limit.setter
    def limit(self, limit):
        """
        Sets the limit of this ExpandOntologyGraphDetails.

        :param limit: The limit of this ExpandOntologyGraphDetails.
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
