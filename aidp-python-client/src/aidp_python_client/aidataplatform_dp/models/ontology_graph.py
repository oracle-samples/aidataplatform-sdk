# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OntologyGraph(object):
    """
    Summary of a published ontology graph.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OntologyGraph object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param project_id:
            The value to assign to the project_id property of this OntologyGraph.
        :type project_id: str

        :param graph_name:
            The value to assign to the graph_name property of this OntologyGraph.
        :type graph_name: str

        :param namespace:
            The value to assign to the namespace property of this OntologyGraph.
        :type namespace: str

        :param class_count:
            The value to assign to the class_count property of this OntologyGraph.
        :type class_count: int

        :param property_count:
            The value to assign to the property_count property of this OntologyGraph.
        :type property_count: int

        :param shape_count:
            The value to assign to the shape_count property of this OntologyGraph.
        :type shape_count: int

        :param relationship_count:
            The value to assign to the relationship_count property of this OntologyGraph.
        :type relationship_count: int

        """
        self.swagger_types = {
            'project_id': 'str',
            'graph_name': 'str',
            'namespace': 'str',
            'class_count': 'int',
            'property_count': 'int',
            'shape_count': 'int',
            'relationship_count': 'int'
        }

        self.attribute_map = {
            'project_id': 'projectId',
            'graph_name': 'graphName',
            'namespace': 'namespace',
            'class_count': 'classCount',
            'property_count': 'propertyCount',
            'shape_count': 'shapeCount',
            'relationship_count': 'relationshipCount'
        }

        self._project_id = None
        self._graph_name = None
        self._namespace = None
        self._class_count = None
        self._property_count = None
        self._shape_count = None
        self._relationship_count = None

    @property
    def project_id(self):
        """
        **[Required]** Gets the project_id of this OntologyGraph.

        :return: The project_id of this OntologyGraph.
        :rtype: str
        """
        return self._project_id

    @project_id.setter
    def project_id(self, project_id):
        """
        Sets the project_id of this OntologyGraph.

        :param project_id: The project_id of this OntologyGraph.
        :type: str
        """
        self._project_id = project_id

    @property
    def graph_name(self):
        """
        Gets the graph_name of this OntologyGraph.

        :return: The graph_name of this OntologyGraph.
        :rtype: str
        """
        return self._graph_name

    @graph_name.setter
    def graph_name(self, graph_name):
        """
        Sets the graph_name of this OntologyGraph.

        :param graph_name: The graph_name of this OntologyGraph.
        :type: str
        """
        self._graph_name = graph_name

    @property
    def namespace(self):
        """
        Gets the namespace of this OntologyGraph.

        :return: The namespace of this OntologyGraph.
        :rtype: str
        """
        return self._namespace

    @namespace.setter
    def namespace(self, namespace):
        """
        Sets the namespace of this OntologyGraph.

        :param namespace: The namespace of this OntologyGraph.
        :type: str
        """
        self._namespace = namespace

    @property
    def class_count(self):
        """
        Gets the class_count of this OntologyGraph.

        :return: The class_count of this OntologyGraph.
        :rtype: int
        """
        return self._class_count

    @class_count.setter
    def class_count(self, class_count):
        """
        Sets the class_count of this OntologyGraph.

        :param class_count: The class_count of this OntologyGraph.
        :type: int
        """
        self._class_count = class_count

    @property
    def property_count(self):
        """
        Gets the property_count of this OntologyGraph.

        :return: The property_count of this OntologyGraph.
        :rtype: int
        """
        return self._property_count

    @property_count.setter
    def property_count(self, property_count):
        """
        Sets the property_count of this OntologyGraph.

        :param property_count: The property_count of this OntologyGraph.
        :type: int
        """
        self._property_count = property_count

    @property
    def shape_count(self):
        """
        Gets the shape_count of this OntologyGraph.

        :return: The shape_count of this OntologyGraph.
        :rtype: int
        """
        return self._shape_count

    @shape_count.setter
    def shape_count(self, shape_count):
        """
        Sets the shape_count of this OntologyGraph.

        :param shape_count: The shape_count of this OntologyGraph.
        :type: int
        """
        self._shape_count = shape_count

    @property
    def relationship_count(self):
        """
        Gets the relationship_count of this OntologyGraph.

        :return: The relationship_count of this OntologyGraph.
        :rtype: int
        """
        return self._relationship_count

    @relationship_count.setter
    def relationship_count(self, relationship_count):
        """
        Sets the relationship_count of this OntologyGraph.

        :param relationship_count: The relationship_count of this OntologyGraph.
        :type: int
        """
        self._relationship_count = relationship_count

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
